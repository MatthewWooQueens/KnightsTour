package chess;

import princeton.introcs.StdDraw;

public class TourViewer3 {
	

	/**
	 * Draws a regular rectangular chess board of the specified size.
	 * 
	 * <p>
	 * Students will need to modify this method to draw irregular boards
	 * if their solutions allows for irregular boards. 
	 * 
	 * @param width the number of squares in the width of the board
	 * @param height the number of squares in the height of the board
	 */
	private static void drawBoard(int width, int height) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(Math.round(width/2), Math.round(height/2), width/2, height/2);
		
		if (width < 1 || height < 1) {
			throw new IllegalArgumentException();
		}
		int max = Math.max(width, height);
		StdDraw.setScale(0.5, max + 0.5);
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if(i%3 == 0 && i != 0) {
					
				}else {
					if ((i + j) % 2 == 0) {
						StdDraw.setPenColor(StdDraw.BLUE);
					} else {
						StdDraw.setPenColor(StdDraw.WHITE);
					}
					StdDraw.filledSquare(i + 1, j + 1, 0.5);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// edit the next line to draw a board of the size that you are testing
		drawBoard(20, 20);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		
		// create a Tour object on the next line
		Tour t = new Tour();
		
		// depending on the structure of your solution you may have to make
		// some more objects here...
		BoardCoords coord = new BoardCoords();
		t.spaces(coord.pattern3(20, 20));
		Location start = new Location(20, 5);
		t.startTour(start);
		Location curr = start;
		t.setPiece(Offset.King);
		
		int i = 0;
		while (t.hasNext()) {
			Location next = t.next();
			System.out.println(i + " : moving from " + curr + " to " + next);
			StdDraw.line(curr.x(), curr.y(), next.x(), next.y());
			StdDraw.filledCircle(next.x(), next.y(), 0.1);
			curr = new Location(next);
			// uncomment the next line to slow down the viewer; 500 is the pause time in milliseconds
			//Thread.sleep(500);
			i++;
		}
		
	}
}
