import java.util.*;
import java.awt.*;
public class Fractal 
{ 
public static final int SIZE = 800;
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
int level = input.nextInt();
DrawingPanel p= new DrawingPanel(SIZE, SIZE);
Graphics g = p.getGraphics();
g.drawLine(0, 0, 0, 800);
g.drawLine(0, 0, 800, 0);
g.drawLine(800,800, 0, 800);
g.drawLine(800,800, 800,0);
drawFigures(level, g, new Point(400,0) , new Point(0, 400*(int)Math.sqrt(3)), new Point(800, 400*(int)Math.sqrt(3)));
}
public static void drawFigures(int level, Graphics g, Point p1, Point p2, Point p3)
{
drawTriangle(g,p1,p2,p3);
if (level>1)
{
drawFigures(level, g, p1, p2, p3 , 2);
}
}
public static void drawFigures(int level, Graphics g, Point p1, Point p2, Point p3, int n)
{
drawTriangle(g, new Point((int)((p1.getX()+p2.getX())/2),(int)(p1.getY()+p2.getY())/2), new Point((int)((p1.getX()+p3.getX())/2),(int)((p1.getY()+p3.getY())/2)), new Point((int)((p2.getX()+p3.getX())/2),(int)((p2.getY()+p3.getY())/2)));
if (n<level)
{
drawFigures(level,g, p1, new Point((int)(p1.getX()+p2.getX())/2,(int)(p1.getY()+p2.getY())/2), new Point((int)(p1.getX()+p3.getX())/2,(int)(p1.getY()+p3.getY())/2),n+1);
drawFigures(level,g, new Point((int)(p1.getX()+p2.getX())/2,(int)(p1.getY()+p2.getY())/2), p2, new Point((int)(p2.getX()+p3.getX())/2,(int)(p2.getY()+p3.getY())/2),n+1);
drawFigures(level,g, new Point((int)(p1.getX()+p3.getX())/2,(int)(p1.getY()+p3.getY())/2), new Point((int)(p2.getX()+p3.getX())/2,(int)(p2.getY()+p3.getY())/2),p3,n+1);
}
}
public static void drawTriangle(Graphics g, Point p1, Point p2, Point p3)
{
g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());
g.drawLine((int)p2.getX(), (int)p2.getY(), (int)p3.getX(), (int)p3.getY());
g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p3.getX(), (int)p3.getY());
}
}