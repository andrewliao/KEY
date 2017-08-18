import java.util.*;

public class Mice{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		// getting numbers for array
		int arraynum = console.nextInt();
		int[] numbers = new int[arraynum];
		for (int i = 0; i < arraynum; i++){
			numbers[i] = console.nextInt();
		}

		// getting mice numbers
		int micenum = console.nextInt();
		
		int[][] mice = new int[micenum][];
		for (int i = 0; i < micenum; i++){
			int num = console.nextInt();
			mice[i] = new int[num];
			for (int j = 0; j < num; j++){
			mice[i][j] = console.nextInt();
			}
		}

		//calculating position
		int match = 0;
		for (int i =0; i < micenum; i++) {
			boolean found = false;
			for (int j = 0, k = 0; j < mice[i].length && k <arraynum; k++) {
				if (mice[i][j] == numbers[k]) {
					if (j == mice[i].length-1) {
						found = true;
						break;
					}
					j++;
				}
			}
			if (found) match++;
		}
		System.out.println(match);
	}
}
