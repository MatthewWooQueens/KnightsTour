package chess;

public interface Movable {

	/**
	 * Checks if the piece can move to the specified location
	 * @param coord, The coordinates of the specified location on the chess board
	 * @return true if the piece can move to the location or false otherwise
	 * @throws IllegalArguementException if the specified location if not on the board
	 */
	public boolean canMoveTo(Location coord);
		
	
	/**
	 * Changes location of piece to the specified location and returns true
	 * @param coord is the specified location on a chess board
	 * @return true if the piece was able to move to the location or false otherwise
	 */
	public boolean move(Location coord);
	
}
