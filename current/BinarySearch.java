
import java.util.*;

public class BinarySearch {
 	public static void main(String[] args) {
 		Scanner console = new Scanner(System.in);
 		int amount = console.nextInt();
 		int[] anArray = new int[amount];
 		for (int i = 0; i < amount; i++) {
 			int num = console.nextInt();
 			anArray[i] = num;
 		}
 		int find = console.nextInt();
 		System.out.println(binarySearch(find, anArray));
 	}

 	public static int binarySearch(int intToSearch, int[] sortedArray) {

    int lower = 0;
    int upper = sortedArray.length - 1;

    while (lower <= upper) {

        int mid = lower + (upper - lower) / 2;

        if(intToSearch < sortedArray[mid]) 

            upper = mid - 1;

        else if (intToSearch > sortedArray[mid]) 

            lower = mid + 1;

        else 

            return mid;
    }

    return -1; // Returns -1 if no match is found
}
 	}





   
