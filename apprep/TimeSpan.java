public class TimeSpan {
	private int hours;
	private int minutes;

	public TimeSpan(int hours, int minutes) {
		this.hours = 0;
		this.minutes = 0;
		add(hours, minutes);
	}

	public void add(int hours, int minutes) {
		if(hours < 0 || minutes < 0) {
			throw new IllegalArgumentException();
		}

		this.hours += hours;
		this.minutes += minutes;

		this.hours += this.minutes / 60;
		this.minutes = this.mmintues % 60;
	}

	public String toString() {
		return hours + "h " + mintues + "m";
	}

}