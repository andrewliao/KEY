import java.util.*;

public class Calculator{
	public static void main(String[] args){
		Scanner console= new Scanner(System.in);
		calculation(console);
	}
	public static void calculation(Scanner console){
		double result= 0.0;
		String equation = console.nextLine();
		int x = equation.length();
		for (int i =1 ; i<=x; i++){
			if (i != x){
				int b = parseInt(equation.substring((i-1),i));
				result= result + b equation.substing(i,i+1);
			} else{
				int c = parseInt(equation.substring((i-1),i));
				result = result c;
			}



		}


	}
}