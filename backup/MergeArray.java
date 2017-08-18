import java.util.*;

public class MergeArray{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int num1 = console.nextInt();
		int[] numbers1 = new int[num1];
		for(int i = 0; i <num1; i++){
			numbers1[i] = console.nextInt();
		}
		int num2 = console.nextInt();
		int[] numbers2 = new int[num2];
		for (int i = 0; i < num2; i++){
			numbers2[i]= console.nextInt();
		}
		int[] array1 = new int[num2+num1];

		int[] result = merge(numbers1, numbers2);
		for (int i=0; i<result.length; i++) {
			if (i != 0) System.out.print(" ");
			System.out.print(result[i]);
		}
		System.out.println(" ");
	} 

	public static int[] merge(int[] a, int[] b) {

    int[] answer = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length)
    {
        if (a[i] < b[j]) {
            answer[k] = a[i];
            i++;
        }  else {
            answer[k] = b[j]; 
            j++;              
        } 
        k++;     
    }

    if (i < a.length-1) {
    	for (int l=i; l< a.length-1; l++) {
    		answer[k] = a[i];
    		k++;
    	}
    } else {
    	for (int l=j; l<b.length; l++) {
    		answer[k] = b[l];
    		k++;
    	}
    }

    return answer;
}
}