
public class Test {

public static void main(String[] args) {
 Point p1 = new Point(7,2);
 Point p2 = new Point(7,2);
 Point p3 = p2;
 p2.translate(2,4);
 System.out.println(p3);
}
}