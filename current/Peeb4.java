import java.util.*;

public class Peeb4 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		calc(console);
	}

	public static void calc(Scanner console) {
		System.out.println("Calculate surface temperature as a function of");
		System.out.println("emissivity for the single-layer atmosphere model.");
		System.out.print("enter emissivity: emissivity (= absorptivity) = ");
		double e = console.nextDouble();
		System.out.println(e);
		double albedo = 0.30;
		double save = 342;
		double omega = 5.67 * Math.pow(10,-8);
		double numerator = 2 * (1 - albedo) * save;
		double denominator = omega * (2 - e);
		double sum1 = numerator / denominator;
		double sum2 = Math.pow(sum1, 0.25);
		System.out.println("surface temperature = " + Math.round(sum2) + "K");
	}
}