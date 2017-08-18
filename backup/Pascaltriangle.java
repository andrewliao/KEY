import java.util.*;

public class Pascaltriangle{
	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		
		int x = console.nextInt();
		int[][] result = new int[x][x];	
		for (int i=0; i<x; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					result[i][j] = 1;
				} else {
					result[i][j] = result[i-1][j-1]+result[i-1][j];
				}
			}
		}

		int space = 2*(x-1);
		for (int i = 0; i<x; i++) {
			for (int j=0; j <space; j++) System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				if (0==j) System.out.print("1");
				else System.out.printf("%4d",result[i][j]);
			}
			System.out.println("");
			space = space-2;
		}
	}
}


