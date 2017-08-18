import java.util.*;

public class RemoveDuplicates {
	public static void main(String [] args) {
		Scanner console = new Scanner(System.in);
		getString(console);

	}

	public static void getString(Scanner console) { 
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("Your original list: ");
		String input = console.next();
		while (!input.equals("lastString")) {
			if (input.equals("lastString")) {
				break;
			} 
			list.add(input);
			input = console.next();
		}
		System.out.println(list);
		System.out.println();
		System.out.print("Your list with duplicates removed: ");
		ArrayList<String> newer = new ArrayList<String>();

		String a1 = "one";
		String a2 = "two";
		if (list.size() <= 1) {
			newer = list;
		} else {
			newer.add(list.get(0));
			for (int i = 1; i < list.size() ; i++) {
			a1 = list.get(i);
			a2 = list.get(i-1);
			if (!a1.equalsIgnoreCase(a2)) {
				newer.add(a1);
				}
			}
		}
		System.out.println(newer);
		System.out.println();


	}


}