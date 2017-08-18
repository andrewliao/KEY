import java.util.*;

public class Peeb2{

	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		calculation(console);
	}

	public static void calculation(Scanner console){
		System.out.println("Calculate radiant power per unit area for Sun and Planet using");
		System.out.println("Stefan-Boltzman Law. From balance equation for Planet,");
		System.out.println("(Power in) = (Power out), predict temperature of Planet.");
		System.out.print("Planet: ");
		String planet = console.nextLine();
		System.out.print("distance of Planet from Sun (AU): ");
		double planettosun = console.nextDouble();
		System.out.print("radius of Planet (km): ");
		int radiusofplanet = console.nextInt();
		System.out.print("albedo of Planet: ");
		double albedoofplanet = console.nextDouble();
		double ss = 64.2 * Math.pow(10,6);
		double rs = 700000;
		double numeratorsp = ss * Math.pow(rs,2);
		double denominatorsp1 = planettosun * 1.5 * Math.pow(10,8);
		double denominatorsp = Math.pow(denominatorsp1,2);
		double fluxsp = (numeratorsp/denominatorsp);
		System.out.println("photon flux SP = " + Math.round(fluxsp));
		double save = fluxsp/4;
		System.out.println("average photon flux SAve = " + Math.round(save));
		double albedosave = ((1-albedoofplanet) * save);
		System.out.println("including albedo SAve x (1 - alpha) = " + Math.round(albedosave));
		double tempnumerator = save * (1 - albedoofplanet);
		double tempdenominator = 5.67 * Math.pow(10,-8);
		double divisiontemp = tempnumerator / tempdenominator;
		double tempk = (Math.pow(divisiontemp,0.25));
		System.out.println("temperature TP (K) = " + Math.round(tempk));
		double tempc = tempk - 273;
		System.out.println("temperature TP (C) = " + Math.round(tempc));
		
	}
}