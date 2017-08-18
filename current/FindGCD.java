import java.util.*;

public class FindGCD { 
	public static void main(String args[]){
  Scanner scanner = new Scanner(System.in); 
  System.out.print("Enter an integer: "); 
  int number1 = scanner.nextInt();
   System.out.print("Enter an integer: "); 
  int number2 = scanner.nextInt(); 
  System.out.println("GCD = " + findGCD(number1,number2)); 
  findGCD(number1,number2);
} 
   
   public static int findGCD(int number1, int number2) { 
 	 if(number2 == 0){ 
 	 	return number1;
 	 	 } 
 	 return findGCD(number2, number1%number2); 
	} 
} 
