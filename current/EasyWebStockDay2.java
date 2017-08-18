import java.util.*;
import java.io.*;

public class EasyWebStockDay2 {
	public static void main(String[]args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter file's name: ");
		String file = console.next();
		Scanner input = new Scanner(new File(file));
		ArrayList<String> tickers = new ArrayList<String>();
		ArrayList<String> var = new ArrayList<String>();
		while(input.hasNext()){
			int tickNum = input.nextInt();
			for(int i=1; i<=tickNum; i++){
				String str = input.next();
				tickers.add(str);
			}
			int varNum = input.nextInt();
			for (int i=1; i<=varNum; i++){
				String str1 = input.next();
				var.add(str1);
			}
		}
		//ex: http://download.finance.yahoo.com/d/quotes.csv?s=STX&f=ne&e=.csv
		System.out.println("Your URL: ");
		System.out.print("http://download.finance.yahoo.com/d/quotes.csv"+"?s=");
		printArray(tickers);
		System.out.print("&f=");
		printArray(var);
		System.out.print("&e=.esv");
	}

	public static void printArray(ArrayList<String> array){
		System.out.print(array.get(0));
		for (int i = 1; i < array.size(); i++){
			System.out.print("+");
			System.out.print(array.get(i));
		}
	}

	
}