public class Rectangle{
	private int width;
	private int height;
	private int x;
	private int y;

	public Rectangle(Point p, int width, int height){
		if (width < 0) {
			throw new IllegalArgumentException();
		}
		if (height < 0) {
			throw new IllegalArgumentException();
		}
		this.x = p.getX();
		this.y = p.getY();
		this.width = width;
		this.height = height;
	}
	public Rectangle(int x, int y, int width, int height){
		if (width < 0) {
			throw new IllegalArgumentException();
		}
		if (height < 0) {
			throw new IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public String toString() {
		return "Rectangle["+ "x=" + this.x + "," + "y=" + this.y + "," + "width=" + this.width + "," + "height=" + this.height +"]";
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public boolean contains(int x, int y) {
		return this.x <= x && x < this.x + this.width && this.y <= y && y < this.y + this.height;
	}

	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}

	public Rectangle union(Rectangle rect) {
		int left = Math.min(this.x, rect.x);
		int right = Math.max(this.x + this.width, rect.x+ rect.width);
		int top = Math.min(this.y, rect.y);
		int bottom = Math.max(this.y + this.height, rect.y + rect.height);
		Point x = new Point(left,top);
		return new Rectangle(x, right-left, bottom-top);
	}


	public Rectangle intersection(Rectangle rect) {
		int left = Math.max(this.x, rect.x);
        int top = Math.max(this.y, rect.y);
        int right = Math.min(this.x + this.width, rect.x + rect.width);
        int bottom = Math.min(this.y + this.height, rect.y + rect.height);
        int width = Math.max(0, right - left);
        int height = Math.max(0, bottom - top);
        Point x = new Point(left,top);
        return new Rectangle(x, width, height);
	}
	
}