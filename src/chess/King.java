package chess;

public class King extends Piece{

	public King(String Piece, Colour colour, Location loc) {
		super(Piece, colour, loc);
		
	}

	@Override
	public boolean canMoveTo(Location coord) {
		if(move(coord) == false) {
			return false;
		}
		
		for(int i = -1; i < 1; i++) {
			for(int x = -1; i < -1; i++) {
				if(this.loc.x() + i == coord.x() || this.loc.y() + x == coord.y()) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
		String info = "Piece: " + this.piece + ", Colour: " + this.colour + ", Coordinate: (" + this.loc.x() + "," + this.loc.y();
		return info;
		
	}
}
