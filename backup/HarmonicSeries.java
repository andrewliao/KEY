import java.util.*;

public class HarmonicSeries{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int[] input = new int[5];
		long[] time = new long[5];
		int[] step = new int[5];
		double[] actual = new double[5];
		for (int i = 0; i< 5; i++) {
			input[i] = console.nextInt();
		}
		for (int i=0; i<5; i++) {
			long start = System.currentTimeMillis();
			int s = 0;
			double r = 0.0;
			double inputAsDouble = (double)input[i];
			while (r<=inputAsDouble ) { 
				s++;
				r += 1.0/(double)s;  
			}
			actual[i] = r;
			step[i] = s;
			long end = System.currentTimeMillis();
			time[i] = end - start;
		}
		System.out.println("Input   Actual Sum          Num of Terms    Time (ms)");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%5d", input[i]);
			System.out.printf("%18.13f",actual[i]);
			System.out.printf("   %12d",step[i]);
			System.out.printf("          %5d",time[i] );
			System.out.println();
			
		}
	}
}