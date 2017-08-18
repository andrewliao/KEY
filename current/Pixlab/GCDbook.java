import java.util.*;

public class GCDbook {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter first number to find GCD"); 
		int num1 = console.nextInt();
		System.out.println("Please enter second number to find GCD"); 
		int num2 = console.nextInt();
		System.out.println("GCD of two numbers " + num1 +" and " + num2 +" is :" + findGCD(num1, num2)); 
		findGCD(num1, num2);
	}

	public static int findGCD(int num1, int num2) {
		if(num1 < 0 || num2 < 0) {
			return findGCD(Math.abs(num1), Math.abs(num2));
		} else if (num2 == 0) {
			return num1;
		} else {
			return(num2, num1 % num2);
		}

	}
}