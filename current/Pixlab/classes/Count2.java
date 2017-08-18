import java.util.*;

public class Count2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
	}

	public static void calc(Scanner console) {
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		ArrayList<String> list = new ArrayList<String>;
		String first = console.next();
		while(true) {
			if(first.equals("lastString")) {
				break;
			}
			list.add(first);
			first = console.next();
		}
		System.out.println(list);
	}
}