import java.awt.*;

public class Colorwheel {
	public static void main(String[] args) throws Exception {
		DrawingPanel panel = new DrawingPanel(512, 512);
		
		Graphics g = panel.getGraphics();
		
		
		for (int i=0; i <900;i++) {
			int red = 0;
			if (i <=300) {
				red = (300-i)*255/300;
			} else if (i>300 && i <=600) {
				red = 0;
			} else {
				red = 255 * (i-600)/300;
			}
			int green = 0;
			if (i>600) {
				green = 0;
			} else if (i<=300) {
				green = 255*i/300;
			} else {
				green = 255*(600-i)/300;
			}
			int blue = 255-red-green;
			g.setColor(new Color(red, blue, green));
			double angle =2.0*Math.PI*(double)i/900.0;
			int endX = (int)(250.0+150.0*Math.cos(angle));
			int endY = (int)(250.0+150.0*Math.sin(angle));
			g.drawLine(250,250, endX, endY);
			Thread.sleep(10);
		}
	}
}

 