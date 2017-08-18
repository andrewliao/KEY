import java.util.*;

public class Sigfig{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String userInput = console.nextLine();
		int signum = countSigFig(userInput);
		System.out.println(signum);
	}


	public static int countSigFig(String str){
		int result = 0;
		boolean hasdecimal = false;
		for (int i = 0; i < str.length();i++){
			if (str.charAt(i) == '.'){
				hasdecimal = true;
				break;
			}
		}

		if (hasdecimal) {
			if (str.charAt(0) == '0'){
				
				for (int i = 2; i< str.length(); i++){
					if (str.charAt(i) != '0'){
						result = str.length()-i;
						break;
					}
				}
			} else {
				result = str.length()-1;
			}

		} else {
			int trailing = 0;
			for (int i = 0; i< str.length();i++){
				if (str.charAt(i) == '0' ){
					trailing++;
				}else {
					trailing = 0;
				}
			}
			result = str.length()-trailing;
		}


		return result;
	}
}