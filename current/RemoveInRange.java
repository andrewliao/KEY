import java.util.*;

public class RemoveInRange {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		calc(console);
	}

	public static void calc(Scanner console) {
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		String first = console.next();
		while(true) {
			if (first.equals("lastString")) {
				break;
			}
			list.add(first);
			first = console.next();
		}
		System.out.println("Your original list: " + list);
		System.out.println();
		System.out.println("Now please enter your start String");
		System.out.println();
		String start = console.next();
		System.out.println("Finally, please enter your end String");
		System.out.println();
		String end = console.next();
		ArrayList<String> revised = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			if (start.compareTo(list.get(i)) > 0 || end.compareTo(list.get(i)) < 0) {
				revised.add(list.get(i));
			}
		}
		System.out.println("Your reduced list: " + revised);
	}
}