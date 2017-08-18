import java.util.*;

public class WriteBinary {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = console.nextInt();
		System.out.println(printBinaryform(num));
	}
 
 
 	public static void printBinaryform(int number) {
	int remainder;
	// check if the number is either 0 or 1 then the number has  been converted to binary
	if (number <= 1) {
		System.out.print(number);
		return;
	}
	// divide the number by 2 using modulus operator so that we get the remainder
	remainder = number % 2;
	//call method again with the quotient as the number
	printBinaryform(number / 2);
	System.out.print(remainder);
}
 }

	

