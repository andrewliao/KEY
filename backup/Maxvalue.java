import java.util.*;

public class Maxvalue{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		calculation(console);
	}
	public static void calculation(Scanner console){
		String number = console.nextLine();
		int numberlength = number.length();
		int max = 0;
		
		
		for(int i = 1; i < numberlength; i++){
			String is = number.substring(i-1,i+1);
			int n = Integer.parseInt(is);
			if (n > max){
				max = n;
			}
			
		}
		
		System.out.println(max);
	}

}