import java.util.*;
 
public class SortSelection {
 
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
        Scanner console = new Scanner(System.in);
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
        	int number = console.nextInt();
        	arr1[i] = number;
             }
        int[] arr2 = doSelectionSort(arr1);
        System.out.print("[");
        for(int i:arr2){
            System.out.print(i);
            if (i == 9) {
        		break;
        	}
            System.out.print(", ");
        }
        System.out.println("]");
    }
}
