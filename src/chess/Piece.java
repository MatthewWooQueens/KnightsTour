package chess;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Piece implements Movable{
	
	ArrayList<String> piecenames = new ArrayList<>(Arrays.asList("BISHOP", "KING", "KNIGHT", "PAWN", "QUEEN", "ROOK"));
	String piece;
	Colour colour;
	Location loc;
	
	public Piece(String Piece, Colour colour, Location loc) {
		if(piecenames.contains(Piece) == false) {
			 throw new IllegalArgumentException("Piece does not exist");
		}
		this.colour = colour;
		this.loc = loc;
	}
	
	public Colour getColour() {
		return this.colour;
	}
	
	public String getpiece() {
		return this.piece;
	}
	
	public boolean move(Location coord) {
		if(coord.x() < 0 || coord.x() > 8 || coord.y() < 0 || coord.y() > 8 ) {
			return false;
		}else {
			this.loc = coord;
			return true;
		}
	}
		
		
}
