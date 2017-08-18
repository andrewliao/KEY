import java.util.*; 

public class GroupProject {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in); 
		int input1 = input("Please enter positive integer a: ", a); 
		int input2 = input("Please enter positive integer b: ", a); 

		int num1 = input1; 
		int num2 = input2; 

		if (input1 < input2) {
			num1 = input2; 
			num2 = input1; 
		}
		System.out.println("LCM = " + runLCM(num1, num2)); 
		System.out.println("GCD = " + runGCD(num1, num2)); 
		System.out.println("(LCM * GCD) == (a * b): " + lol(num1, num2)); 

	}

	public static int GCD(int a, int b) {
		int gcd = 0; 
		for (int i = 1; i < a; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i; 
			}
		}
		return gcd; 
	}

	public static int runLCM(int a, int b) {
		int lcm = a * b; 
		lcm = lcm / runGCD(a, b); 
		return lcm; 

	}

	public static int input(String a, Scanner b) {
		System.out.print(a); 
		int input = b.nextInt(); 
		return input; 
	}

	public static Boolean lol(int num1, int num2) {
		Boolean is = false; 
		if (runLCM(num1, num2) * runGCD(num1, num2) == num1 * num2) {
			is = true; 
		}
		return is; 
	}

}