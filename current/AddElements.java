import java.util.*;

public class AddElements {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.println("Enter size of integer array: ");
	int sum = console.nextInt();
	System.out.println("Enter n integers separated by spaces: ");
	int[] a = new int[sum];
	for (int i = 0; i <sum; i ++) {
		int one = console.nextInt();
		a[i] = one;
	}
	int sumlist = sum(a,a.length-1);
	System.out.println("The sum of the elements in your list: " + sumlist);
	}
	
	public static int sum(int[] a, int n) {
    	 if (n == 0) {
        return a[0];
    } else {
        return a[n] + sum(a, n - 1);
    }
	}

}
