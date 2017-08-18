
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);

        int number = console.nextInt();
        int of, total;
        
        if(number > 1) {
        	total = 2;
             int i = 2;
             int remaining = number;
             int power = 0;
             while (i <= number && remaining > 1) {
             	if (remaining%i == 0) {
             		power++;
             		remaining = remaining/i;
             	} else {
             		if (power > 0) {
             			System.out.println(i+" to the power of "+power);
             		}
             		power=0;
             		i++;
             	}
             }
             if (power > 0) {
             	System.out.println(i+" to the power of "+power);
             }

             for (i = 2; i < number; i++) {
             	if (number%i ==0) total++;
             }
       } else {
        	total = 1;
        }
        System.out.println("Number of factors: " + total);
    }
}