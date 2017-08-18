import java.util.*;

public class BackTrackTravel {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
		int x = console.nextInt();
		int y = console.nextInt();
		backTrackTravel(x, y);
	}

	public static void backTrackTravel(int targetX, int targetY) {
		explore(targetX, targetY, 0, 0, "moves: ");
	}

	public static void explore(int targetX, int targetY, int currX, int currY, String path) {
		if(currX == targetX && currY == targetY) {
			System.out.println(path);
		} else if (currX <= targetX && currY <= targetY) {
			explore(targetX, targetY, currX, currY + 1, path + " N");
			explore(targetX, targetY, currX + 1, currY + 1, path + " NE");
			explore(targetX, targetY, currX + 1, currY, path + " E");
		}

	}
}