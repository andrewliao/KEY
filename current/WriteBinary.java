import java.util.*;
public class WriteBinary{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int index= input.nextInt();
		System.out.print("Enter an integer: ");
		if(index<0){
			System.out.print("-");
		}
		if(index==0){
			System.out.print("0");
		}
		converter(index);
		System.out.println("");
	}
	public static void converter(int nimabi){
		String answer=null;

		if(nimabi>0){
			converter(nimabi/2);
			System.out.print(nimabi%2);
		}
		else if(nimabi<0){
			converter(nimabi/2);
			System.out.print(Math.abs(nimabi%2));
		}
	}
}