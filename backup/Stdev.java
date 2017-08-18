import java.util.*;

public class Stdev{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the integer array dimension: ");
		int dimension = console.nextInt();
		int[] numbers = new int[dimension];
		System.out.println("Please enter the array elements: ");
		for (int i = 0; i< dimension; i++){
			numbers[i] = console.nextInt();
		}
		int total = 0;
		for (int i = 0; i < dimension; i++){
			total = numbers[i]+total;
		}
		double mean = (double)total / (double)dimension;

		double sum1 = 0;
		double no = 0;
		double power = 0;
		for (int i = 0; i<dimension; i++){
			sum1 = numbers[i]-mean;

			no = sum1 * sum1;

			power = power + no;
			
		}
		double deviation =  Math.sqrt(power / (double)(dimension-1));
		System.out.printf("Standard deviation = %-5.3f\n", deviation);
	}
}