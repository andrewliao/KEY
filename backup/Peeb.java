import java.util.*;
import java.text.DecimalFormat;

public class Peeb{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Calculate radiant photon flux at a given wavelength");
		System.out.println("and temperature using Planck's Law");
		System.out.print("wavelength in microns: ");
		double wavelength = console.nextDouble();
		System.out.print("temperature in degrees Kelvin: ");
		double temperature = console.nextDouble();
		calculation(wavelength, temperature);
	}

	public static void calculation(double x, double y){
		double h = 6.626068 * Math.pow(10,-34);
		double c = 299792500;
		double k = 1.38066 * Math.pow(10,-23);
		x = x * Math.pow(10,-6);
		double numerator = 2 * h * Math.pow(c, 2);
		double fraction = (h  * c) / (x * y * k);
		double e = Math.exp(fraction);
		double denominator = Math.pow(x,5) * (e - 1);
		double b = numerator / denominator;
		DecimalFormat df1 = new DecimalFormat("0.00E00");
		System.out.println("radiant flux B = " + df1.format(b).toLowerCase());


	}
}