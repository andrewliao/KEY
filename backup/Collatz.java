import java.util.*;

public class Collatz {
	public static void main(String[] args){
		Scanner console= new Scanner(System.in);
		calculation(console);
		

	}
	public static void calculation(Scanner console){
		int number = console.nextInt();
		int max = 0;
		for (int i = 1; i <= number; i++){
			int num1 = console.nextInt();
			int count = 1;
			while (num1 != 1){
				if (num1% 2 != 0) {
					num1 = ((num1*3)+1);
				} else {
					num1 = num1/2;
				}
				count++;

			}
			if (count > max){
				max = count;
			}
			System.out.println("number of times: " + count);

		}
		System.out.println("Maximmum: " + max);
	}		
}
			
		

	
