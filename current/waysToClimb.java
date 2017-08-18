import java.util.*;

public class waysToClimb {
    public static int count=0;
     public static void main(String[] args) {
       System.out.print("Enter the number of stairs to climb: ");
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       String str="";
       find(num,str);  
       System.out.println("total # steps: "+ count);
       
   }

public static void find(int num, String str) {
  if (num == 0) {
    System.out.println(str);
    count++;
  }
  if (num >= 1) {
    find(num - 1, str + "1 ");
  }
  if (num >= 2) {
    find(num - 2, str + "2 ");
  }
  }    
}