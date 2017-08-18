import java.util.*;

public class Fencepost{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String f = console.nextLine();
		int g = f.length();
		for (int i = 1; i<=g; i++){
			if(i!=g){
			System.out.print(f.substring((i-1),i)+"..");
		}else{
			System.out.println(f.substring((i-1),i));
		}

		}
	}
}