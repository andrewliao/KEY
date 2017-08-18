import java.util.*;

public class Halloween{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String s = console.nextLine();
		String num = "100";
		int x = 0;
		for (int i = 0; i < s.length()-1; i++){
			if (s.charAt(i) == ' '){
				x = i;
			}

		}
	
		num = s.substring(x+1, s.length());
		int nums = Integer.parseInt(num);
		
		int sum = 0;
		char a;
		int b;
		for (int i = 0; i < x; i++){
			a = s.charAt(i);
			b = (int) a;
			sum = sum + b;
			
		}
		char c = s.charAt(nums);
		int cal = (int) c;
		sum = sum - cal;
		System.out.println(sum);

	}
}