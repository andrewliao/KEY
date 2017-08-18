public abstract class Ticket{
	protected int number;

	public Ticket(int number) {
		this.number = number;
	}

	public String toString() {
		return "Number: " + this.number + ", " + "Price: " + getPrice();
	}

	public abstract double getPrice();
}