import java.util.*;

public class Interleave {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		calc(console);
	}

	public static void calc(Scanner console) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println();
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();
		int first1 = console.nextInt();
		while(true) {
			if (first1 == 0) {
				break;
			}
			Integer value1 = new Integer(first1);
			list1.add(value1);
			first1 = console.nextInt();
		}
		System.out.println("Your first list: " + list1);
		System.out.println();
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();
		int second = console.nextInt();
		while(true) {
			if (second == 0) {
				break;
			}
			Integer value2 = new Integer(second);
			list2.add(value2);
			second = console.nextInt();
		}
		System.out.println("Your second list: " + list2);
		System.out.println();
		ArrayList<Integer> last = new ArrayList<Integer>();
		
		if (list1.size() == list2.size()) {
			for (int i = 0; i < list1.size(); i ++) {
				last.add(list1.get(i));
				last.add(list2.get(i));
			}
		}
		if (list1.size() > list2.size()) {
			for(int i = 0;i < list2.size(); i++) {
				last.add(list1.get(i));
				last.add(list2.get(i));
			}
			for(int i = list2.size(); i< list1.size(); i++) {
				last.add(list1.get(i));
			}
		}
		if (list1.size() < list2.size()) {
			for(int i = 0;i < list1.size(); i++) {
				last.add(list1.get(i));
				last.add(list2.get(i));
			}
			for(int i = list1.size(); i< list2.size(); i++) {
				last.add(list2.get(i));
			}
		}
		list1 = last;
		System.out.println("Your interleaved list: " + list1);
	}
}