public class AdvanceTicket extends Ticket {
	protected int daysInAdvance;

	public AdvanceTicket(int number, int daysInAdvance) {
		super(number);
		this.daysInAdvance = daysInAdvance;
	}

	public double getPrice() {
		if (this.daysInAdvance >= 10) {
			return 30.0;
		} 
		return 40.0;
	}


}


