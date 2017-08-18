import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		int tmp;

		
		while (b != 0){
			tmp = a;
			a = b;
			b = tmp % b;
		}
		System.out.println("Enter positive integer a:     ");
		System.out.println("Enter positive integer b < a: ");
		System.out.println("Greatest common divisor (GCD) = "+a);
	}
}