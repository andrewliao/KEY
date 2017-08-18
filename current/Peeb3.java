import java.util.*;
import java.math.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Peeb3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		calculation(console);
	}

	public static void calculation(Scanner console) {
		DecimalFormat df = new DecimalFormat("0.00E00");
		int earthradius = 3959;
		double atmosphericpressure = 14.7;
		double co2concentration = 400;
		double humanpopulation = 7.3 * Math.pow(10,9);
		System.out.println("Calculate weight% of CO2 in Earth's atmosphere and");
		System.out.println("anthropomorphic contribution to that weight. Estimate");
		System.out.println("zero-emissions recovery time and project future trends.");
		System.out.println();
		
		System.out.print("carbon footprint per person (tons) = ");
		int footprintperperson = console.nextInt();
		System.out.println("annual per capita CO2 absorption capacity = ");
		double annualpercapitaCO2 = console.nextDouble();
		double earthsurfacearea = (4 * Math.PI *  Math.pow(earthradius,2));
		System.out.println("surface area Earth (sq mi) = " + df.format(earthsurfacearea));
		double inchearthsurfacearea = earthsurfacearea * Math.pow(5280,2) * Math.pow(12,2);
		System.out.println("surface area Earth (sq in) = " + df.format(inchearthsurfacearea));
		double weightatmospherelb = inchearthsurfacearea * atmosphericpressure;
		System.out.println("weight of atmosphere (lbs) = " + df.format(weightatmospherelb));
		double weightatmospheretons = weightatmospherelb * 0.0005;
		System.out.println("weight of atmosphere (tons) = " + df.format(weightatmospheretons));
		double weightconcentrationC02ppmw = co2concentration * 1.54;
		System.out.println("weight concentration CO2 (ppmw) = " + (int)weightconcentrationC02ppmw);
		double weightpercentco2 = weightconcentrationC02ppmw / 10000;
		System.out.printf("weight percent CO2 = %.3f\n",weightpercentco2);
		double weigthco2tons = weightatmospheretons * weightpercentco2 / 100;
		System.out.println("weight CO2 (tons) = " + df.format(weigthco2tons));
		System.out.println();
		
		DecimalFormat af = new DecimalFormat("#.###");
		af.setRoundingMode(RoundingMode.CEILING);
		double anthropormorphicco2footprint = humanpopulation * footprintperperson;
		System.out.println("anthropormorphic CO2 footprint (tons) = " + df.format(anthropormorphicco2footprint));
		double anthropormorphicco2percent = anthropormorphicco2footprint / weigthco2tons * 100;
		System.out.println("anthropomorphic CO2 percent = " + af.format(anthropormorphicco2percent));
		System.out.println();
		
		int co2concentration1750 = 280;
		double co2concentration1750ppmw = co2concentration1750 * 1.54;
		double weightpercentco21750 = co2concentration1750ppmw / 10000;
		double weightco2tons1750 = weightatmospheretons * weightpercentco21750 / 100;
		System.out.println("weight CO2 in 1750 (tons) = " + df.format(weightco2tons1750));
		double co2gainedtons = weigthco2tons - weightco2tons1750;
		System.out.println("CO2 weight gain (tons) = " + df.format(co2gainedtons));
		double co2absorbtioncapacity = annualpercapitaCO2 * humanpopulation;
		System.out.println("CO2 annual absorption capacity (tons) = " + df.format(co2absorbtioncapacity));
		double zeroemissionstime = co2gainedtons / co2absorbtioncapacity;
		System.out.println("zero-emissions absorption time (years) = " + Math.round(zeroemissionstime));
		System.out.println();
		
		int co2concentration1900 = 280;
		int numberofyears = 115;
		double anthropomorphicnum = anthropormorphicco2percent / 100;
		double co2interestrate = ((Math.pow(10, (Math.log10((double)co2concentration/(double)co2concentration1900) / numberofyears))) -1) * 100;
		
		System.out.printf("average CO2 interest rate since 1900 (percent) = %.3f\n",  co2interestrate);
		double year20factor = Math.pow((1+anthropomorphicnum),20);
		System.out.printf("20 year factor @ 2015 interest rate = %.2f\n",  year20factor);
		double year50factor = Math.pow((1+anthropomorphicnum),50);
		System.out.printf("50 year factor @ 2015 interest rate = %.2f\n",  year50factor);
		double year100factor = Math.pow((1+anthropomorphicnum),100);
		System.out.printf("100 year factor @ 2015 interest rate = %.2f\n",  year100factor);


	}



}

