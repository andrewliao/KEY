import java.util.*;

public class LastIndexOf {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int[] numbers = new int[7];
		System.out.println("Please enter seven elements of an integer array and a value: ");
		for (int i = 0; i<= numbers.length; i++){
			if (i < numbers.length){
			numbers[i] = console.nextInt();
			
			} 
		}
		int last = console.nextInt();
		
		int count = 1000;
		for (int i = 0; i < numbers.length; i++){
			int number = numbers[i];
			if (number == last){
				count = i;
				
			} 
		}
		if (count == 1000){
			count = -1;
		}

		System.out.println("Last index of value = " + count);

	}
}