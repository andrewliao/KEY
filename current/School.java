import java.util.*;

public class School {
	public static void main(String[] args) {
		int[] numbers = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
		int index = Arrays.binarySearch(numbers, 29);
		System.out.println("29 is found at index " + index);

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-3);
		list.add(2);
		list.add(29);
		list.add(35);
		int index2 = Collections.binarySearch(list, 29);
		System.out.println(index2);

		String[] strings = {"c", "b", "a", "s"};
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));

		String[] strings2 = {"FoxTrot", "cucumber", "Asdffe", "a", "b"};
		Arrays.sort(strings2, new LengthComparator(7));
		System.out.println(Arrays.toString(strings2));
	}


}