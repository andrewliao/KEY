import java.util.*;
import java.util.Arrays; 
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner console = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			arr[i] = console.nextInt();
		}
		System.out.println("selectionSort");
		sort(arr);
		System.out.println();
	} 

    public static void sort(int[] arr) {
    	for (int i=0; i<arr.length-1; i++) {
            int min = i;  
    		System.out.println(Arrays.toString(arr));   
        	for (int j=i+1; j<arr.length; j++) {
            	if (arr[min] > arr[j]) {
                	min = j;  
            	}
        	}if (min != i) { 
            	int a = arr[i];
            	arr[i] = arr[min];
            	arr[min] = a;
        	}
    	} System.out.println(Arrays.toString(arr));
	}
}