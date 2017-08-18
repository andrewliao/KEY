import java.util.*;

public class Nov28{
	public static void main(String[] args){

		// first get a valid integer in string
		Scanner console = new Scanner(System.in);

		// iterate thru user input
		start(console);		
	}

	public static void start(Scanner console) {
		boolean shouldContinue = false;
		String[] inputArray = null, patternArray = null;
		do {
			String intString = getInput(console);
			while (intString == null) {
				System.out.print("Invalid input. ");
				intString = getInput2(console);
			}

			// second iterate
			String result = findResult(intString);

			// check if the result is found
			int foundLocation = resultAlreadyExists(patternArray, result);
			if (foundLocation>=0) {
				System.out.println("PATTERN RECOGNIZED: This pattern is the same as the pattern produced by the input: " + inputArray[foundLocation]);
			}

			// add to existing array
			if (inputArray == null) {
				inputArray = new String[1];
				patternArray = new String[1];
				inputArray[0] = intString;
				patternArray[0] = result;
			} else{
				incrementStringArray(inputArray, intString);
				incrementStringArray(patternArray, result);
			}

			// should add ask continue or not
			System.out.println("Again? ('yes' or 'no')");
			String answer = console.nextLine();
			if (answer.equals("yes")){
				shouldContinue = true;
			} else {
				System.out.println("Exiting.");
				shouldContinue = false;
			}
		} while (shouldContinue);
	}

	private static int resultAlreadyExists(String[] patternArray, String currentPattern) {
		if (patternArray == null) {
			return -1;
		}
		for (int i = 0; i < patternArray.length; i++){
			if (patternArray[i].equals(currentPattern)){
				return i;
			}
		}
		return -1;
	}

	public static String getInput(Scanner console) {
		System.out.print("Enter an integer <= 10 digits long: ");
		String initial = console.nextLine();
		//check if it is less than 10 digit long input
		if (initial.length()>10 || initial.length() < 1) {
			return null;
		}
		
		//check if integer is a positive number
		for (int i = 0; i < initial.length();i++) {
			if (initial.charAt(i) < '0' || initial.charAt(i) > '9'){
				return null;
			}
		}
		System.out.println("0. " + initial);
		return initial;
	}

	public static String getInput2(Scanner console) {
		System.out.println("Please enter valid input.");
		String initial = console.nextLine();
		//check if it is less than 10 digit long input
		if (initial.length()>10 || initial.length() < 1) {
			return null;
		}
		
		//check if integer is a positive number
		for (int i = 0; i < initial.length();i++) {
			if (initial.charAt(i) < '0' || initial.charAt(i) > '9'){
				return null;
			}
		}
		System.out.println("0. " + initial);
		return initial;
	}


	public static String findResult(String input) {
		boolean done = false;
		String[] strarr = new String[1];
		strarr[0] = input;
		// 1. calcuate next string
		// 2. then compare to all the existing ones
		// 3. if found match, set done to true
		// else create a new string array
		int found = 0;
		int distance = 0;
		String next = "0";
		while (!done) {
			// create the next string
			String last = strarr[strarr.length-1];
			next = buildNext(last, strarr.length);

			// compared
		
			for (int i=0; i <strarr.length; i++){
				if (strarr[i].equals(next)) {
					done = true;
					found = i;
					distance = strarr.length-i;
					String[] newarr = new String[strarr.length+1];
				for (int j=0; j < strarr.length; j++) {
					newarr[j] = strarr[j];
				}
				newarr[strarr.length] = next;
				strarr = newarr;
					break;
				}
			}

			//adding string to array
			if (!done) {
				String[] newarr = new String[strarr.length+1];
				for (int i=0; i < strarr.length; i++) {
					newarr[i] = strarr[i];
				}
				newarr[strarr.length] = next;
				strarr = newarr;
			} 

			if (done){
				for (int i = 0; i < (distance-1); i++){
					last = strarr[strarr.length-1];
					next = buildNext(last,strarr.length);
					strarr = incrementStringArray(strarr, next);
				}
			}

		}
		System.out.println("Repeating pattern detected starting at index " + found +'.');
		System.out.println("The repeating pattern is " + distance + " step(s) long.");
		return next;
	}

	private static String[] incrementStringArray(String[] input, String newElement) {
		String[] output = new String[input.length+1];

		for (int i =0; i <input.length; i++) {
			output[i] = input[i];
		}
		output[output.length-1]=newElement;
		return output;
	}

	public static String buildNext(String intString, int step){
		int[] counter = new int[10];
		for (int i = 0; i <intString.length(); i++){
			int x = Integer.parseInt(intString.substring(i,i+1));
			counter[x]++;
		}
		System.out.print(step+". ");
		String out = "";
		boolean hasNumberBefore = false;
		for (int i = 1; i <=9; i++) {
			if (counter[i] >0){
				if (hasNumberBefore) {
					System.out.print(", ");
				} else {
					hasNumberBefore = true;
				}
				out += counter[i];
				System.out.print(counter[i]);
				out += i;
				System.out.print(i);
			} 
		}
		if (counter[0] >0){
			if (!hasNumberBefore) {
				hasNumberBefore = true;
			} else {
				System.out.print(", ");
			}
			out += counter[0];
			System.out.print(counter[0]);
			out += '0';
			System.out.print(0);
		} 
		System.out.println("");
		return out;
	}

}