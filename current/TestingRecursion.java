import java.util.*;

public class TestingRecursion {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//calculating factorial
		System.out.println("Enter an input: ");
		int input = console.nextInt();
		System.out.println(input + "! is " + factorial(input));
		//count the number of X in a string
		System.out.println("Enter your string");
		String input2 = console.next();
		System.out.println("number of x's in this string:" + countX(input2));

	} 

	public static int factorial(int input) {
		if (input == 0 || input == 1) {
			return 1;
		} else if (input < 0) {
			return -1 * factorial(-input);
		} else {
			return input * factorial(input - 1);
		}
	}

	public static int countX(String str) {
		if (str.length() > 1) {
			if(str.charAt(0) == 'x') {
				return 1 + countX(str.substring(1, str.length()));
			} else {
				return countX(str.substring(1, str.length()));
			}
		} else {
			if (str.charAt(0) == 'x') {
				return 1;
			} else {
				return 0;
			}
		}
	}



}