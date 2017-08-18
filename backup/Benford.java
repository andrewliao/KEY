import java.util.*;
import java.io.*;

public class Benford{
	public static void main(String[] args) throws Exception{
		Scanner console = new Scanner(System.in);
		System.out.println("Let’s count those leading digits...");
		System.out.print("input file name?");
		String filename = console.nextLine();
		Scanner input = new Scanner(new File(filename));

		int[] counter = new int[9];
		int total = 0;
		int count0 = 0;
		while(input.hasNext()){
			
			String str = input.next();
			int x = Integer.parseInt(str.substring(0,1));
			if (x == 0){
				count0++;
			}else {
				counter[x-1]++;
				total++;
			}
		}	
		if (count0 != 0){
			System.out.println(" excluding " + count0+ " zeros");
			System.out.println("Digit Count Percent");
		} else{
			System.out.println(" Digit Count Percent");
		}
		for (int i = 0; i < 9; i++){
			System.out.printf("%5d",(i+1));
			System.out.printf(" %5d",counter[i]);
			double percent = ((double)counter[i]/(double)total)*100;
			System.out.printf(" %6.2f\n",percent);

		}	
		System.out.print("Total");
		System.out.printf("%6d",total);
		System.out.println(" 100.00");

	}
}