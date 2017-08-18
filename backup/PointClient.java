/*
Enhance your Point class to include:
	toString method		//produces and returns the desired string, e.g (19, 5)
	getQuadrant method	//returns the quadrant in which (x, y) lies (or 0 if on axis)
	distanceToOrigin	//returns distance from (x, y) to origin (use double)
*/
import java.util.*;

public class PointClient{
    public static void main(String[] args){

    	Point mooDefault = new Point();
		System.out.println("mooDefault = " + mooDefault);

    	Scanner console = new Scanner(System.in);
		int x = getNumber("Enter x-value: ", console);
		int y = getNumber("Enter y-value: ", console);

        Point moo = new Point(x,y);
        System.out.println("moo = " + moo);
        

        moo.translate(2,2);
        moo.setXY(moo.getX(),0);
        moo.translate(0,19);
        moo.setXY(moo.getY(),moo.getX());
		System.out.println("(" + moo.getX() + ", " + moo.getY() + ")");
		System.out.println("Quadrant: " + moo.getQuadrant());
		System.out.println("Distance to origin: " + moo.distanceToOrigin());

		Point other = new Point(18,5);
		System.out.println("slope = " + moo.slope(other));

		System.out.println("x = " + x); //prints PointClient x (variable in PointClient scope)
		System.out.println("x = " + moo.getX()); //prints Point x (field in Point scope)
		System.out.println("moo = " + moo); //the toString method is implicitly called
		System.out.println("moo = " + moo.toString()); // produces same output as lien above

	}

	public static int getNumber(String prompt, Scanner console){
		System.out.print(prompt);
		int num = console.nextInt();
		return num;
	}

}
/*
Test Cases (showing HyperGrade input/output):
1. unhidden
mooDefault = (0, 0)\n
Enter x-value: Enter y-value: moo = (3, 3)\n
(19, 5)\n
Quadrant: 1\n
Distance to origin: 19.6468827043885\n
x = 3\n
x = 19\n
moo = (19, 5)\n
moo = (19, 5)\n

2. hidden
mooDefault = (0, 0)\n
Enter x-value: Enter y-value: moo = (5, 5)\n
(19, 7)\n
Quadrant: 1\n
Distance to origin: 20.248456731316587\n
x = 5\n
x = 19\n
moo = (19, 7)\n
moo = (19, 7)\n

3. hidden
mooDefault = (0, 0)\n
Enter x-value: Enter y-value: moo = (-7, -7)\n
(19, -5)\n
Quadrant: 4\n
Distance to origin: 19.6468827043885\n
x = -7\n
x = 19\n
moo = (19, -5)\n
moo = (19, -5)\n

*/