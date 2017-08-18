import java.util.*;

public class Hanoi {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Number of disks: ");
		int input = console.nextInt();
		System.out.println("Move " + input + " disks from post A to post B as follows:");
		
		moveDisk(input, "A", "B", "C");


	}

	public static void moveOneDisk(String source, String dest) {
		System.out.println("Move disk from " + source + " to " + dest);
	}

	public static void moveDisk(int input, String source, String dest, String temp) {
		if (input == 1) {
			moveOneDisk(source,dest);
		} else {
			moveDisk(input-1, source, temp, dest);
			moveOneDisk(source,dest);
			moveDisk(input-1, temp, dest, source);
		}
	}
}