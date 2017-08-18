public class testing {
	public static void main(String[] args)
		throws java.io.IOException {

		char ch, ignore, answer = 'k';

		do {
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");

			//read a character
			ch = (char) System.in.read();

			//discard any other characters in the input buffer
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');

			if (ch == answer) {
				System.out.println("You are right!");
			} else {
				System.out.print("Sorry, you're");
				if (ch > answer) {
					System.out.println(" to high!");
				} else {
					System.out.println(" to low!");
				}
				System.out.println("Try Again!\n");
			} 
		} while(answer != ch);

	}
}