public class TwoRockets {
	public static void main(String[] args){
		DrawingPanel panel = new DrawingPanel(256, 256);
		
		Graphics g = panel.getGraphics();
		for(int i = 0, i <= 900, i ++){
			for (int j = i; j <= 300, j++){
				int red = 255 - (255
		
		}
			
			g.setColor(new Color(red, blue, green));
			double angle =2.0*Math.PI*(double)i/900.0;
			int endX = (int)(100.0+50.0*Math.cos(angle));
			int endY = (int)(100.0+50.0*Math.sin(angle));
			g.drawLine(100,100, endX, endY);
			}
		}
	

}