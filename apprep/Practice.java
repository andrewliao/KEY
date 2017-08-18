import java.util.*;

public class Practice {
	public static void main(String[] args) {
		int x = Math.abs(-145);
		System.out.println(x);
		double y = Math.random();
		System.out.println(y);
		Random generator = new Random();
		double z = generator.nextDouble();
		System.out.println(z);
		String xy = "xy";
		xy += "xv";
		int zx = xy.length();
		System.out.println(xy);
		System.out.println(zx);
	}
}