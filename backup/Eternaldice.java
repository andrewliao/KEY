import java.util.*;

public class Eternaldice{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		calculation(console);
	}
	public static void calculation(Scanner console){
		int bob;
		int cob;
		int dob; 
		int dobfirst = 0;
		
		Random generator = new Random();
		System.out.print("User Input No.Rounds: ");
		int numrounds = console.nextInt();
		
		
		for (int i = 0; i <numrounds; i++){
			bob = generator.nextInt(6)+1;
			
			cob = generator.nextInt(6)+1;
			
			dob = generator.nextInt(6)+1;
			
			if(bob != 6 && cob != 6 && dob ==6){
				dobfirst++;
				
			}else if (bob == 6 || cob == 6)
			{ }
			else {
				i--;
			}
		}
		
		double dobpercentage = (double)dobfirst / (double)numrounds;
		System.out.printf("%.4f", dobpercentage);
		

		
	}
}