import java.util.*;
public class InsertionSort {
	public static void main (String [] args) {
		Scanner console = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++){
			arr [i] = console.nextInt();
		}
		System.out.println("insertionSort");
		insertsort(arr);
		System.out.println("");
	}

	 public static void insertsort(int[] arr){
		int a;
		int b;
        for (int i = 1; i < arr.length; i++) {
        	System.out.println(Arrays.toString(arr));
            for(int c = i ; c > 0 ; c--){
                if(arr[c] < arr[c-1]){
                    a = arr[c];
                    arr[c] = arr[c-1];
                    arr[c-1] = a;
                }
            } 
        } 
        System.out.println(Arrays.toString(arr));
	}
}