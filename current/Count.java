import java.util.*;

public class Count {
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
		System.out.println();
		String input = console.next();
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			if (input.equals("lastString")) {
				break;
			}
			list.add(input.toLowerCase());
			input = console.next();

		}
		ArrayList<Integer> numerical = new ArrayList<Integer>();
		int num1= 0;
		System.out.println("Your original list: " + list);
		for (int i = 1; i <list.size(); i++) {
			if (i == 1 && list.get(i).equals(list.get(i-1))) {
				num1 = 2;
			} else if (i== 1 && !list.get(i).equals(list.get(i-1))) {
				num1 =1;
				numerical.add(num1);
			}
			if (i > 1 && list.get(i).equals(list.get(i-1))) {
				num1 += 1;

			} else if (i>1) {
				numerical.add(num1);
				num1 = 1;
			}

			if (i == list.size()-1) {
				numerical.add(num1);
			}

		}
		Collections.sort(numerical);
		System.out.println("Count: " + numerical);

	}
}