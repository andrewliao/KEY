/*
import java.util.*;
public class WriteBinaryString{

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
*/

import java.util.*;

public class WriteBinaryString {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		int index= input.nextInt();
		System.out.print("Enter an integer: Binary expression: ");
		if(index<0){
			System.out.print("-");
		}
		if(index==0){
			System.out.println("0");
		}
		index = Math.abs(index);
		if(index !=0) {
		System.out.println(writeBinaryString(index));
	}
		
	}

	public static String writeBinaryString(int num) {
		
		if(num < 2) {
			return Integer.toString(num);
		}
		else {
			return writeBinaryString(num/2) + Integer.toString(num%2);
			/*
			String numDiv2= writeBinaryString(num/2);
			String numMod = writeBinaryString(num%2);
			return num
			*/
		}
	}
}