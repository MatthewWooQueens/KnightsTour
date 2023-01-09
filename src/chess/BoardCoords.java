package chess;

import java.util.HashSet;

public class BoardCoords {
	
	public HashSet<Location> pattern2(int width, int height){
		HashSet<Location> unvisited = new HashSet<Location>();  
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				unvisited.add(new Location(i,j));
			}
			height--;
		}
		
	
		return unvisited;
	}
	
	public HashSet<Location> pattern1(int width, int height){
		HashSet<Location> unvisited = new HashSet<Location>();  
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				unvisited.add(new Location(i,j));
			}
		}
		return unvisited;
	}
	
	public HashSet<Location> pattern3(int width, int height){
		HashSet<Location> unvisited = new HashSet<Location>();  
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				if((i-1)%3 == 0 && (i-1) != 0) {
					
				}else {
				unvisited.add(new Location(i,j));
				}
			}
		}
		return unvisited;
	}
	
}
