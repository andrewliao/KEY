import java.util.*;

public class WriteNums {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		calc(console);
	}

	public static void calc(Scanner console) {
		int num = console.nextInt();
		System.out.print("Enter an integer: ");
		for (int i = 1; i < num; i++) {
			System.out.print(i+ ", ");
		}
		System.out.println(num);
	}
}