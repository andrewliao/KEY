import java.util.*;

public class Inclass3{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);		
		boolean shouldContinue = false;
		String[] inputArray = null, patternArray = null;

		// do multiple rounds
		do {
			// 1. get a valid input string
			String intString = getInput(console);

			// 2. find the repeating pattern
			String result = findResult(intString);

			// 3. check if the result is found previously
			int foundLocation = resultAlreadyExists(patternArray, result);
			if (foundLocation>=0) {
				System.out.println("PATTERN RECOGNIZED: This pattern is the same as the pattern produced by the input: " 
					+ inputArray[foundLocation]);
			}

			// 4. add to existing array
			inputArray = incrementStringArray(inputArray, intString);
			patternArray = incrementStringArray(patternArray, result);

			// 5. should add ask continue or not
			shouldContinue = askIfContinue(console);
		} while (shouldContinue);
	}

	private static boolean askIfContinue(Scanner console) {
		//prompt question again to see if needs to be continued
		boolean shouldContinue = false;
		System.out.println("Again? ('yes' or 'no')");
		String answer = console.nextLine();
		if (answer.equals("yes")){
			shouldContinue = true;
		} else {
			System.out.println("Exiting.");
			shouldContinue = false;
		}
		return shouldContinue;

	}


	private static int resultAlreadyExists(String[] patternArray, String currentPattern) {
		//to check if the result already exist and it will print out pattern recognized 
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

	private static String getInput(Scanner console) {
		//prompt the user to input a number
		System.out.print("Enter an integer <= 10 digits long: ");
		String intString = null;
		while (intString == null) {
			intString = askForOneInput(console);
			if (intString == null) 	{
				//checks if integer is valid
				System.out.println("Please enter valid input.");
			}
		}
		return intString;
	}

	private static String askForOneInput(Scanner console) {
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

	private static String findResult(String input) {
		boolean done = false;
		String[] strarr = new String[1];
		strarr[0] = input;
		// 1. calcuate next string
		// 2. then compare to all the existing ones
		// 3. if found match, set done to true, else create a new string array
		int found = 0;
		int distance = 0;
		String next = "0";
		while (!done) {
			// create the next string
			String last = strarr[strarr.length-1];
			next = buildNext(last, strarr.length);

			// comparing with all previous array output
		
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

			//when finished make sure to print out lines
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
		//in order to create an array when comparing from different output values
		String[] output;
		if (input == null) {
			output = new String[1];
			output[0] = newElement;
			return output;
		} 

		output = new String[input.length+1];
		for (int i =0; i <input.length; i++) {
			output[i] = input[i];
		}
		output[output.length-1]=newElement;
		return output;
	}

	private static String buildNext(String intString, int step){
		//build next string arrays when comparing between different input values
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
		//to check if number is seen before
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