import java.util.*;

public class Clump{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		calc(console);
	}

	public static void calc(Scanner console) {
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value " + '"' + "stop"+ '"' + ", followed by a return.");
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		String word = console.next();
		while(true) {
			if (word.equals("stop")) {
				break;
			}
			list.add(word);
			word = console.next();
		}
		System.out.println("Your original list: " + list);
		ArrayList<String> lasted = new ArrayList<String>();
		int size = list.size() / 2;
		String last = "cool";
		for (int i = 0; i < (size*2); i+=2) {
			last = '(' + list.get(i) + " " + list.get(i+1) + ')';
			lasted.add(last);
		}
		if (list.size() > (size * 2)) {
			String worst = list.get(list.size()-1);
			lasted.add(worst);
		}
		System.out.println();
		System.out.println("Your clumped list: " + lasted);
	}
}