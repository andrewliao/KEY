import java.util.*;

public class Array1{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		calc(console);
	}

	public static void calc(Scanner console){
		int total = console.nextInt();
		int[] numbers = new int[total];
		for (int i = 0; i < total; i++){
			numbers[i] = console.nextInt();
		}
		System.out.print("[");
		for (int i = (total - 1); i >= 0; i--){
			System.out.print(numbers[i]);
			if (i  > 0){
			System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}