import java.util.*;

public class Reverse3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		calc(console);
	}

	public static void calc(Scanner console) {
		System.out.println();
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int value = console.nextInt();
		while(true) {
			if (value == 0) {
				break;
			}
			Integer value2 = new Integer(value);
			list.add(value2);
			value = console.nextInt();
		}
		System.out.println("Your original list: " + list);
		System.out.println();
		ArrayList<Integer> revised = new ArrayList<Integer>();
		int revisesize = list.size()/3;
		for(int i = 0; i < revisesize * 3; i+= 3) {
			revised.add(list.get(i+2));
			revised.add(list.get(i+1));
			revised.add(list.get(i));
		}
		if (list.size() > revisesize * 3) {
			revised.add(list.get(list.size()-2));
			revised.add(list.get(list.size()-1));
		}
		System.out.println("Your reversed3 list: " + revised);

	}
}