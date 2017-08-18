import java.util.*;

public class Mice2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int rows = console.nextInt();
		int columns = console.nextInt();
		String[] layout = new String[rows];
		boolean[][] visited = new boolean[rows][columns];
		for (int i = 0; i < rows; i++) {
			layout[i] = console.next();
		}
		int count = 0;
		int initial = 0;
		int initialr = 0;
		if (test(layout, visited, count, initial, initialr)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

	// this function is to check if can go thru this cell to get mouse
	public static boolean test(String[] layout, boolean[][] visited, int count, int index, int row) {
		visited[row][index] = true;
		if (layout[row].charAt(index) == 'M') {
			return true;
		} else if (layout[row].charAt(index) == '-') {
			return false;
		} else {
			int width = layout[row].length();
			// check if you can go down
			if (row < layout.length -1 && !visited[row+1][index]) {
				if (test(layout, visited, count, index, row+1)) return true;
			}
			// check if go right
			if (index < width -1 && !visited[row][index+1]) {
				if (test(layout, visited,  count, index+1, row)) return true;
			}
			// check if go left
			if (index > 0 && !visited[row][index-1]) {
				if(test(layout, visited, count, index-1, row)) return true;
			}

			// check if go up
			if (row > 0 && !visited[row-1][index]) {
				if(test(layout, visited, count,index,row-1)) return true;
			}

		}
		return false;
	}
	
}