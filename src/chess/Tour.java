package chess;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Tour {
	private Location knight = new Location();
	private HashSet<Location> unvisited = new HashSet<Location>();  
	private ArrayList<Location> result;
	private Offset offset;
	
	public void startTour(Location loc) {
		this.knight.x(loc.x());
		this.knight.y(loc.y());
		this.unvisited.remove(this.knight);
	}
	
	public void setPiece(Offset piece) {
		this.offset = piece;
	}
	
	public void spaces(HashSet<Location> coord) {
		HashSet<Location> temp = coord;
		this.unvisited = temp;
	}
	
	public boolean hasNext() {
		this.result = new ArrayList<>();
		boolean movable = false;
		//Loop through all offset pos
		for(int[] delta: this.offset.get()) {
			//If state checks if offset loc is in the unvisited hashset
			if(this.unvisited.contains(new Location(this.knight.x() + delta[0],this.knight.y() + delta[1]))) {
				movable = true;
				this.result.add(new Location(this.knight.x() + delta[0],this.knight.y() + delta[1]));
			}
		}
		return movable;
	}
	
	public Location next() {
		bestmove move = new bestmove();
		Location temp = move.next(this.unvisited, this.knight, this.result, this.offset);
		if(temp == null) {
			return null;
		}else {
			this.unvisited.remove(temp);
			this.knight = temp;
			return this.knight;
		}
	}
}
