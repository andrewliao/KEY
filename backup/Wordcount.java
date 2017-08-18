import java.util.*;
import java.io.*;

public class Wordcount{
	public static void main(String[] args) throws Exception {
		Scanner console = new Scanner(System.in);
		String fileName = console.nextLine();
		Scanner input = new Scanner(new File(fileName));
		int count = 0;
		while (input.hasNext()) {
			input.next();
			count++;
		}
		System.out.println("Total words = " + count);
	}
}