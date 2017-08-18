public class Point {
	private int x;
	private int y;

	public Point(int initialX, int initialY) {
		setLocation(initialX, initialY);
	}

	public Point() {
		x = 0;
		y = 0;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setLocation(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}

	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public double distanceFromOrigin() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}