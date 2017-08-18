import java.util.*;

public class Count2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		calc(console);
	}

	public static void calc(Scanner console) {
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> characters = new ArrayList<String>();
		String first = console.next();
		if (!first.equals("lastString")) {
		characters.add(first);
		}
		while(true) {
			if(first.equals("lastString")) {
				break;
			}
			list.add(first);
			first = console.next();
			if(!characters.contains(first) && !first.equals("lastString")){
				characters.add(first);
			}
		}
		
		Collections.sort(list);
		ArrayList<String> characters2 = new ArrayList<String>();
		characters2 = characters;
		Collections.sort(characters2);
		ArrayList<Integer> numerical = new ArrayList<Integer>();
		int num1= 0;
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
		
		
		int num2 = 0;
		if (characters.size() >= 1) {
				for (int i = 0; i < characters.size(); i++) {
				System.out.print(characters.get(i));
				num2 = characters2.indexOf(characters.get(i));
				System.out.println(" " + numerical.get(num2));
			}
		}



	}
}