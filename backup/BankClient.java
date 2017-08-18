import java.util.*;

public class BankClient {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);


		double money1 = console.nextDouble(); //money in Brian's account
		double money2 = console.nextDouble(); //money in Marvin's account
		double money3 = console.nextDouble(); //money in Tammy's account

		BankAccount brian = new BankAccount(money1, "Brian");
		System.out.println(brian);
		brian.deposit(100.0);
		System.out.println(brian);
		brian.withdraw(10); 
		System.out.println(brian);


		System.out.println();
		CheckingAccount marvin = new CheckingAccount(money2, "Marvin");
		System.out.println(marvin);
		marvin.withdraw(1.0);
		System.out.println(marvin);
		marvin.withdraw(2.0);
		System.out.println(marvin);


		System.out.println();
		BankAccount tammy = new CheckingAccount(money3, "Tammy");
		System.out.println(tammy);		
		tammy.withdraw(5.65);
		tammy.deposit(15.35);
		System.out.println(tammy);

	}
}