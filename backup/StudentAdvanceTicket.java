public class StudentAdvanceTicket extends Ticket {
	protected int daysInAdvance;

	public StudentAdvanceTicket(int number, int daysInAdvance) {
		super(number);
		this.daysInAdvance = daysInAdvance;
	}

	public double getPrice() {
		if (this.daysInAdvance >= 10) {
			return 15.0;
		} 
		return 20.0;
	}

	public String toString() {
		return super.toString() + " (ID required)";
	}
}