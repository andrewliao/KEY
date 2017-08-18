public class Line {
	Vect2 a;
	Vect2 b;

	public Line(Vect2 a, Vect2 b){
		this.a = a;
		this.b = b;
	}

	public Line rotate(double angle, Vect2 center) {
		this.a = this.a.rotate(angle,center);
		this.b = this.b.rotate(angle,center);
		return this;
	}

	public Line translate(Vect2 transform) {
		this.a = this.a.add(transform);
		this.b = this.b.add(transform);
		return this;
	}

	public double length() {
		double square1 = Math.pow(b.getX()-a.getX(),2);
		double square2 = Math.pow(b.getY()-a.getY(),2);
		double add = square2 + square1;
		return Math.pow(add,0.5);
	}

	public String toString() {
		return "(" + "("+ a.getX() + ", " + a.getY() + ")" + ", " + "(" + b.getX() + ", " + b.getY() +")" + ")";
	}


}