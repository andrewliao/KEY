/*
Get inputs from console and exercise your Rectangle and Point classes.
Both your client program and your Rectangle class make use of your Point class.
*/
import java.util.*;

public class RectangleClientHG{
    public static void main(String[] args){

    	System.out.println("Rectangles are specified by the coordinates of the");
    	System.out.println("upper-left-hand corner, a width, and a height.");
    	System.out.println("Assume all values are integers, and that the y-dimension");
    	System.out.println("is increasing downward.");

    	Scanner console = new Scanner(System.in);

		System.out.println("Please specify a point (x, y) for the ULH corner of");
		System.out.println("your first triangle.");
		int xp1 = getNumber("Enter x-value : ", console);
		int yp1 = getNumber("Enter y-value : ", console);
		Point p1 = new Point(xp1, yp1);
		System.out.println("Point1 = " + p1.toString());
		int width1 = getNumber("Enter first rectangle width: ", console);
		int height1 = getNumber("Enter first rectange height: ", console);
		Rectangle Rect1 = new Rectangle(p1, width1, height1);
		System.out.println("Rectangle1 = " + Rect1.toString());
		System.out.println();
   	
		System.out.println("Please specify your second rectangle.");
		int x2 = getNumber("Enter x-value for upper-left-hand corner: ", console);
		int y2 = getNumber("Enter y-value for upper-left-hand corner: ", console);
		int width2 = getNumber("Enter second rectangle width: ", console);
		int height2 = getNumber("Enter second rectangle height: ", console);
		Rectangle Rect2 = new Rectangle(x2,y2, width2, height2);
		System.out.println("Rectangle2 = " + Rect2.toString());
		System.out.println();

		System.out.println("Please specify a second point.");
		int xp2 = getNumber("Enter x-value : ", console);
		int yp2 = getNumber("Enter y-value : ", console);
		Point p2 = new Point(xp2, yp2);
		System.out.println("Point2 = " + p2.toString());
		System.out.println();

		System.out.println("Rectangle1 contains " + p2.toString() + " = " + Rect1.contains(p2));
		System.out.println("Rectangle union = " + (Rect1.union(Rect2)).toString());
		System.out.println("Rectangle intersection = " + (Rect1.intersection(Rect2)).toString());
	}
	public static int getNumber(String prompt, Scanner console){
		System.out.print(prompt);
		int num = console.nextInt();
		return num;
	}
}