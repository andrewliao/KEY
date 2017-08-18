public class Point{
	private int x;
	private int y;

	// constructors
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public Point(){
		this(0,0);
	}

	// public methods
	public String toString() {
		return "("+this.x+", "+this.y+")";
	}
	
	public int getQuadrant() {
		if (this.x > 0 && this.y > 0){
			return 1;
		} else if (this.x > 0 && this.y < 0){
			return 4;
		} else if (this.x < 0 && this.y > 0){
			return 2;
		} else if (this.x < 0 && this.y < 0){
			return 3;
		} else {
			return 0;
		}
	}

	public double distanceToOrigin(){
		double distanceToOrigin = Math.pow(this.x,2)+Math.pow(this.y,2);
		distanceToOrigin = Math.sqrt(distanceToOrigin);
		return distanceToOrigin;
	}

	public Point translate(int dx, int dy){
		this.x+=dx;
		this.y+=dy;
		return this;
	}


	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public Point setXY(int x, int y){
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		this.x=x;
		this.y=y;
		return this;
	}

}