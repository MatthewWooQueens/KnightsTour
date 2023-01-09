package chess;

import java.util.ArrayList;
import java.util.HashSet;

public class bestmove {
	
	public Location next(HashSet<Location> unvisited, Location knight, ArrayList<Location> result, Offset offset){
		Location tempKngt = knight;
		ArrayList<Location> tempresult = result;
		
		
		int oldposbl = 10;
		int newposbl = 0;
		for(Location loc: tempresult) {
			for(int[] delta: offset.get()) {
				//Checks if the offset loaction is in "unvisited", if it is then newposbl increases
				if(unvisited.contains(new Location(loc.x() + delta[0], loc.y() + delta[1]))) {
					newposbl++;
				}
			}
			//checks if the potential loc has fewer openings than the previous loc
			//oldpsbl set to 10 in order to allow the first loc to be starting value
			if(newposbl < oldposbl && newposbl != 0) {
				tempKngt = loc;
				oldposbl = newposbl;
			}else if(newposbl == 0 && tempKngt == knight){
				tempKngt = loc;
				oldposbl = 9;
			}
			newposbl = 0;
		}
		if(oldposbl == 10) {
			return null;
		}else {
			return tempKngt;
		}
	}
}
