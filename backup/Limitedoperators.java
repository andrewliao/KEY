import java.util.*;

public class Limitedoperators{
	public static void main(String[] args){
		Scanner console= new Scanner(System.in);
		System.out.println("Enter two integers to be added:");
		int x = console.nextInt();
		int y = console.nextInt();
		System.out.println("The sum is "+add(x,y));
		System.out.println("The difference is "+ subtract(x,y));
		System.out.println("The quotient is "+quotient(x,y));
		System.out.println("The remainder is "+remainder(x,y));

	}
	public static int add(int x, int y){
		int result = x;
		for (int i = 1; i <=y; i++) {
			result++;
		}
		return result;
	}
	
	public static int subtract(int x, int y){
		int result = x;
		for (int i =1; i <=y;i++ ) {
			result--;
		}
		return result;
	}
	
	public static int quotient(int x, int y){
		int remaining = x;
		int z = 0;
		while (remaining>=y){
			for (int i = 1; i <= y; i++){
				remaining--;
			}

			z++;
		}
		return z;
	}
	
	public static int remainder(int x, int y){
		int p = x;
		while (p >=y){
			for (int i = 1; i <=y; i++){
				p--;
			}

		}
		return p;
	}
	
	
}