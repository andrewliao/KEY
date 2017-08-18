import java.util.*;
import java.io.*;
import java.net.*;

public class WebStock3 {
	public static void main(String[] args) throws FileNotFoundException, MalformedURLException, IOException{
		String baseURL = "http://download.finance.yahoo.com/d/quotes.csv";
		File f = new File("symbols1.txt"); 
		Scanner input = new Scanner(f);
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		createList(array, array2, input);
		String urlString = baseURL + "?s=";
		for(int i = 0; i < array.size(); i++){
			urlString += array.get(i);
			if(i != array.size() - 1){
				urlString += "+";
			}
		}
		urlString += "&f=";
		for(int j = 0; j < array2.size(); j++){
			urlString += array2.get(j);
		}
		urlString += "&e=.csv";
		
		makeTable(urlString, array.size(), array2.size());
        
	}
	public static void createList(ArrayList<String> array, ArrayList<String> array2, Scanner input) {
		int n = input.nextInt();
		for(int i = 0; i < n; i++){
			String stock = input.next();
			array.add(stock);
		}
		int m = input.nextInt();	
		for(int j = 0; j < m; j++){
			String symbol = input.next();
			array2.add(symbol);
		}
	}
	
	public static void makeTable(String urlString, int arraySize1, int arraySize2) throws MalformedURLException, IOException{
		System.out.println("n				      s	          e          p2          e         r	       r6");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		URL yourURL = new URL(urlString);
		Scanner sc = new Scanner(yourURL.openStream());
		for(int j = 0; j < arraySize1; j++){
			String temp = sc.nextLine();
			List<String> list = new ArrayList<String>(Arrays.asList(temp.split(",")));
			for(int i = 0; i < arraySize2; i++){
				if(i % 7 == 0){
					System.out.printf("%-35s", list.get(i));
				}
				else if(i % 7 == 6){
					System.out.printf("%-12s", list.get(i));
					System.out.println();
				}
				else{
					System.out.printf("%-12s", list.get(i));
				}
			}
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		
	}

}