import java.util.*;

public class Classwork{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		calculation(console);
	}
	public static void calculation(Scanner console){
		
		Random generator = new Random();
		
		
		int sum = console.nextInt();
		int result2 = 0;
		while (result2 != sum){
			int number1 = generator.nextInt(6)+1;
			int number2 = generator.nextInt(6)+1;
			int sum2 = number1 + number2;
			System.out.println(number1 + " and " + number2 +" = " +sum2);
			result2 = sum2;
		}
	}

}