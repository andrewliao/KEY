import java.util.*;

public class WriteSequence{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input = console.nextInt();
		writeSequence(input); 
		System.out.println();
	}

	public static void writeSequence(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		} else if (n == 1) {
			System.out.print(1);
		} else if ( n==2 ) {
			System.out.print("1 1");
		} else {
			int number = (n+1) / 2;
			System.out.print(number + " ");
			writeSequence(n - 2);
			System.out.print(" " + number);
		} 
	}

}