import java.util.*;

public class Group1 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter positive integer a: ");
		int a = console.nextInt();
		System.out.print("Please enter positive integer b: ");
		int b = console.nextInt();
		System.out.println("LCM = " + LCM(a,b));

		System.out.println("GCD = " + GCD(a,b));
		System.out.println("(LCM * GCD) == (a * b): "+ Input(a,b));
	}

	public static int LCM(int x, int y){
		int result, big, small;
		if (x>=y) {
			result = x;
			big = x;
			small = y;
		} else {
			result = y;
			big = y;
			small = x;
		}
		while (result % small != 0) {
			result = result + big;
		}
		return result;

	}	
	
	public static int GCD(int x, int y){
		int result=1, big, small;
		if (x>=y) {
			big = x;
			small = y;
		} else {
			big = y;
			small = x;
		}
		for (int i=2; i <= small; i++) {
			if (x%i==0 && y%i==0) {
				result = i;
			}
		}
		return result;
	}

	public static boolean Input(int x, int y){
		return(GCD(x,y) * LCM(x,y) == x * y);
	}

	
}