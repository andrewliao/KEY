import java.util.*;
 
public class BubbleSort {
 
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
 
    private static void swapNumbers(int i, int j, int[] array) {
 
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
            	System.out.print("[");
            }
            if (i != input.length-1) {
            System.out.print(input[i] + ", ");
            	} else {
            		System.out.print(input[i] + "]");
            	}

        }
        System.out.print("\n");
    }
 
    public static void main(String[] args) {
    	 Scanner console = new Scanner(System.in);
        int[] input = new int[10];
        for (int i = 0; i < 10; i++) {
        	int number = console.nextInt();
        	input[i] = number;
             }
        
        bubble_srt(input);
 
    }
}
