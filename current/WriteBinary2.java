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
			System.out.print("0");
		}
		index = Math.abs(index);
		System.out.println(writeBinaryString(index));
		
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