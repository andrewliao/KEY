public class BankAccount {
	protected double number;
	protected String name;

	public BankAccount(double number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return "Amount in " + this.name +"'s " + "account is: " + this.number;
	}

	public double deposit(double amount) {
		this.number += amount;
		return this.number;
	}

	public double withdraw(double amount) {
		this.number -= amount;
		return this.number;
	}

}