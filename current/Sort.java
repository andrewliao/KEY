import java.util.*;

public class Sort {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		/*//bubble sort list elements
		ArrayList<Integer> list = new ArrayList();
		int number = console.nextInt();
		for (int i = 0; i < number, i++) {
			int input = console.nextInt();
			list.add(input);
		}
		//call for bubblesort
		System.out.print(bubbleSort(list));

		*/

		//mergeSort elements
		ArrayList<Integer> list2 = new ArrayList();
		int number2 = console.nextInt();
		for (int i = 0; i < number2; i++) {
			int input2 = console.nextInt();
			list2.add(input2);
		}

		//call for merge sort
		System.out.println(mergeSort(list2));


	}
/*
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
			
	}
*/

	public static ArrayList<Integer> mergeSort(ArrayList<Integer> list2) {
		if (list2.size() == 2) {
			return list2;
		} else {
			int half = list2.size();
			return mergeSort(list2.subList(0,half)) + mergeSort(list2.subList(half,list2.size()));
		}
	}

}