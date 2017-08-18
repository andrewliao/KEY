public class TestCase {
	public static void main(String [] args) {
		Point p1 = new Point();
		p1.x = 7;
		p1.y = 2;

		Point p2 = new Point();
		p2.x = 4;
		p2.y = 3;

		System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
		System.out.println("distance from origin = " + p1.distanceFromOrigin());

		System.out.println("p2 is (" + p2.x + ", " + p2.y + ")");
		System.out.println("distnace from origin = " + p2.distanceFromOrigin());
		System.out.prinln();

		p1.x += 11;
		p1.y += 6;
		p2.x += 1;
		p2.y += 7;

		System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
		System.out.println("p2 is (" + p2.x + ", " + p2.y + ")");
	}
}