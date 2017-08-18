public class CheckingAccount extends BankAccount{

	public CheckingAccount (double number, String name) {
		super(number,name);
	}

	public double withdraw (double amount) {
		this.number = number - 1;
		if (this.number < amount) {
			System.out.println("Insufficient funds!");
			this.number +=1 ;
			return this.number;
		} else {
			return this.number -= amount;
		}
	}

	public String toString() {
		return "Amount left in " + this.name +"'s " + "account is: " + this.number;
	}
}