import java.awt.*;
import java.util.*;

public class ExDrawline{
	public static final double Acceleration = -9.81;
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);


		int start = console.nextInt();
		int end = console.nextInt();
		int step = console.nextInt();
		DrawingPanel panel = new DrawingPanel(1000,600);
		DrawingPanel panel1 = new DrawingPanel(2000,300);
		Graphics g = panel.getGraphics();
		for (int i = start; i <= end; i+=step){
			draw(30, i, g);
		}
	}

	private static void draw(double initialSpeed, double angle, Graphics g) {
		double rad = Math.toRadians(angle);
		double ySpeed = initialSpeed* Math.sin(rad);
		double xSpeed = initialSpeed*Math.cos(rad);
		int prevx = 0, prevy=0;
		for (int i = 0; i<=100; i++){
			double t = ((double)i)/10.0;
			int y = (int)((ySpeed * t + (Acceleration / 2.0) * t*t)*10.0);
			int x = (int)((t * xSpeed)*10.0);
			g.drawLine(prevx,prevy,x,y);
			prevy = y;
			prevx = x;
		}
	}
}
