import java.util.*;

public class MeanDev{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i< n; i++){
			numbers[i] = console.nextInt();
		}
		int total = 0;
		for (int i = 0; i<n;i++){
			total = numbers[i]+total;
		}
		int mean = total/n;
		
		int dev = -1;
		int moon = 0;
		int yon = 0;
		int bob = 0;
		for (int i = 0; i<n; i++){
			moon = mean - numbers[i];
			yon = Math.abs(moon);
			if (yon > bob){
				bob = yon;
				dev = numbers[i];
			}
		}
		System.out.println(dev);

	}
}