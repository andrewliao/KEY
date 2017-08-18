import java.util.*;
import java.io.*;

public class PinsAndBalls{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.print("Input file name: ");
		String fileName = input.next();
		File f = new File(fileName);
		while (!f.exists())
		{
			System.out.print("File not found. Try again: ");
			f = new File(input.next());
		}
		Scanner fInput = new Scanner(f);
		System.out.println("Pin arrangement:");
		int n = fInput.nextInt();
		int[][] board = new int[n][n];
		createArray(fInput, board, n);
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i + 1; j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		findMax(board, n);
		int max = board[0][0];
		System.out.println("Maximum possible score: " + max);
	}
	
	public static void createArray(Scanner fInput, int[][] board, int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i + 1; j++){
				board[i][j] = fInput.nextInt();
			}
		}
	}
	
	public static void findMax(int[][] board, int n){
		for(int num = 0; n > 0; n--){
			int rowa = n - 2;
			int rowb = n - 1;
			for(int i = 0; i < n - 1; i++){
				int a = board[rowa][i] + board[rowb][i];
				int b = board[rowa][i] + board[rowb][i + 1];
				board[rowa][i] = Math.max(a, b);
			}
		}
	}
	
}

/*
if(j == place){
					num1 = num;
				}
				if(j == place + 1){
					num2 = num;
				}
			}
			System.out.println();
			if(num1 > num2){
				total += num1;
			}
			else{
				place++;
				total += num2;
			}
			//System.out.println(total);
		}
		return total;
		*/