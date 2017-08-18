import java.util.*;

public class Diceprobability{
	public static void main(String[] args){
		

		Scanner console= new Scanner(System.in);
		calculation(console);
	}
		public static void calculation(Scanner console){
		int desiredsum = 0;
		int numbersum = 0;
		int output = 0;
		System.out.print("Desired sum: ");
		double desired = console.nextInt();
		System.out.print("Desired num of rolls: ");
		double number = console.nextInt();

		Random generator = new Random();
		int sum;
		for (int i=0; i<number; i++){
			desiredsum = generator.nextInt(6)+1;
			numbersum = generator.nextInt(6)+1;
			sum = numbersum + desiredsum;
			if (sum == desired){
				output++;
			}
		}
		double probability = output/number;
		System.out.printf("%1.4f\n", probability);
	}
}
