package chess;

public enum Offset {
	Kngt(new int[][] {{2,-1},{2,1},{1,-2},{1,2},{-2,-1},{-2,1},{-1,-2},{-1,2}}),
	King(new int[][] {{1,1},{1,0},{1,-1},{0,1},{0,0},{0,-1},{-1,1},{-1,0},{-1,-1}});
	
	private final int[][] off;
	
	private Offset(int[][] offset) {
		this.off = offset;
	}
	
	public int[][] get() {
		return off;
	}
	

	
}
