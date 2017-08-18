import java.util.*;
import java.io.*;

public class Personality {
	//class constant
	public static final int Dimensions = 4;

	public static void main(String[] args) throws Exception {
		File file = getFile();
		processFile(file);
	}
 
	public static File getFile() {
		//need the user to input file name
		Scanner console = new Scanner(System.in);
		System.out.print("Input file name: ");
		String filename = console.nextLine();
		File file = new File(filename);
		//checks and reprompts until user inputs a real file
		while(!file.exists()) {
			System.out.println("This file does not exist. Try again.");
			System.out.print("Input file name: ");
			filename = console.nextLine();
			File secondtry = new File(filename);
			if (secondtry.exists()){
				file = secondtry;
			}
		}
		return file;
	}

	public static void processFile(File file) throws FileNotFoundException {
		//process the output
		Scanner input = new Scanner(file);
		boolean isFirst = true;
		while (input.hasNextLine()) {
			String nameLine = input.nextLine();
			String answerLine = input.nextLine();
			//make sure there exist a println unless it is after last person taking the survey
			if (isFirst) {
				isFirst = false;
			} else {
				System.out.println();
			}
			processOneRecord(nameLine, answerLine);
		}
	}

	public static void processOneRecord(String nameLine, String answerLine) {
		//print out person taking the test
		System.out.println(nameLine +':');
		//set variables for different types of questions and answers
		int[] aCount = new int[Dimensions];
		int[] bCount = new int[Dimensions];
		//do a for loop for the 10 groups of 7 questions and add up the A and B
		for (int i = 0; i < 10; i++) {
			//for first question
			if (answerLine.charAt(i*7) == 'A' || answerLine.charAt(i*7) == 'a'){
				aCount[0]++;
			} else if (answerLine.charAt(i*7) == 'B' || answerLine.charAt(i*7) == 'b'){
				bCount[0]++;
			}
			//for second question
			if (answerLine.charAt(i*7+1) == 'A' || answerLine.charAt(i*7+1) == 'a'){
				aCount[1]++;
			} else if (answerLine.charAt(i*7+1) == 'B' || answerLine.charAt(i*7+1) == 'b'){
				bCount[1]++;
			}
			//for thrid question
			if (answerLine.charAt(i*7+2) == 'A' || answerLine.charAt(i*7+2) == 'a'){
				aCount[1]++;
			} else if (answerLine.charAt(i*7+2) == 'B' || answerLine.charAt(i*7+2) == 'b'){
				bCount[1]++;
			}
			//for fourth question
			if (answerLine.charAt(i*7+3) == 'A' || answerLine.charAt(i*7+3) == 'a'){
				aCount[2]++;
			} else if (answerLine.charAt(i*7+3) == 'B' || answerLine.charAt(i*7+3) == 'b'){
				bCount[2]++;
			}
			//for fifth question
			if (answerLine.charAt(i*7+4) == 'A' ||answerLine.charAt(i*7+4) == 'a'){
				aCount[2]++;
			} else if (answerLine.charAt(i*7+4) == 'B' || answerLine.charAt(i*7+4) == 'b'){
				bCount[2]++;
			}
			//for sixth question
			if (answerLine.charAt(i*7+5) == 'A' || answerLine.charAt(i*7+5) == 'a'){
				aCount[3]++;
			} else if (answerLine.charAt(i*7+5) == 'B' || answerLine.charAt(i*7+5) == 'b'){
				bCount[3]++;
			}
			//for seventh question
			if (answerLine.charAt(i*7+6) == 'A' || answerLine.charAt(i*7+6) == 'a'){
				aCount[3]++;
			} else if (answerLine.charAt(i*7+6) == 'B' || answerLine.charAt(i*7+6) == 'b'){
				bCount[3]++;
			}
		}
		//line output for A-B ratio
		System.out.print("    ");
		for (int i=0; i<Dimensions; i++) {
			System.out.print(aCount[i] + "A" + "-" + bCount[i] + "B ");
		}
		System.out.println();

		//figuring out percentage of B for each subgroup
		int eiofb = (int)Math.round(100.0 * bCount[0] / (aCount[0] + bCount[0]));
		int snofb = (int)Math.round(100.0 * bCount[1] / (aCount[1] + bCount[1]));
		int tfofb = (int)Math.round(100.0 * bCount[2] / (aCount[2] + bCount[2]));
		int jpofb = (int)Math.round(100.0 * bCount[3] / (aCount[3] + bCount[3]));
		
		//find out which letters to print out
		String results = "";
		//first letter
		if (eiofb > 50){
			results = results + "I";
		} else if(eiofb < 50){
			results = results + "E";
		} else {
			results = results + "X"; 
		}
		//second letter
		if (snofb > 50){
			results = results + "N";
		} else if(snofb < 50){
			results = results + "S";
		} else {
			results = results + "X"; 
		}
		//third letter
		if (tfofb > 50){
			results = results + "F";
		} else if(tfofb < 50){
			results = results + "T";
		} else {
			results = results + "X"; 
		}
		//fourth letter
		if (jpofb > 50){
			results = results + "P";
		} else if(jpofb < 50){
			results = results + "J";
		} else {
			results = results + "X"; 
		}
		//print out last line
		System.out.print("    [" + eiofb + "%, " + snofb + "%, " + tfofb + "%, " + jpofb + "%] = ");
		System.out.println(results);		
	}
}