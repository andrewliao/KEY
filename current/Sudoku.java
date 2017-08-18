package sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class Sudoku {
	public static int[][] board = new int[9][9];
	public static final int[][] areaNumberMatrix = new int[][] {
		{0,0,0,1,1,1,2,2,2},
		{0,0,0,1,1,1,2,2,2},
		{0,0,0,1,1,1,2,2,2},
		{3,3,3,4,4,4,5,5,5},
		{3,3,3,4,4,4,5,5,5},
		{3,3,3,4,4,4,5,5,5},
		{6,6,6,7,7,7,8,8,8},
		{6,6,6,7,7,7,8,8,8},
		{6,6,6,7,7,7,8,8,8}};
				
	public static void main(String[] args) {
		
		getBoard(board);

		// method to find unfilled elements
		ArrayList<SudokuElement> unfilledElements = new ArrayList<SudokuElement>();	
		// build new element and add to list if it is 0
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0) {
					SudokuElement ele = new SudokuElement(i, j);
					unfilledElements.add(ele);
					//System.out.println("row "+ele.getRow()+"; column "+ele.getColumn());
				}
			}
		}
		
		// find possible values for all unfilled elements
		for (SudokuElement element : unfilledElements) {
			for(int i = 1; i <= 9; i++) {
				if (isNumberOk(element,i)) {
					element.addPossibleValue(i);
				}
			}
			//System.out.println("row: " + element.getRow() + ";" 
			//+ " column " + element.getColumn()+ " "+ element.getaddPossibleValue());
		}		
		
		boolean found = fillNumber(unfilledElements, 0);

	}
	
	private static boolean fillNumber(ArrayList<SudokuElement> unfilledElements, int start) {
		
		SudokuElement element = unfilledElements.get(start);
		
		for (int i = 0; i < element.getaddPossibleValue().size(); i++) {
			if (isNumberOk(element, element.getaddPossibleValue().get(i))) {
				board[element.getRow()][element.getColumn()] = element.getaddPossibleValue().get(i);
				
				if (start == unfilledElements.size()-1) {
					printBoard();
					return true;
				}
			
				if (fillNumber(unfilledElements,start+1)) {
					return true;
				} else {
					board[element.getRow()][element.getColumn()] = 0;
				}
			} 

		}
		return false;
			
	}
	
	private static void printBoard() {
		System.out.println();
		System.out.println();
		System.out.println("Finished Board:");
		
		for (int[] x : board) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
	
	
	private static void getBoard(int[][] board) {
		
		//prompt the question
		System.out.println("Welcome to the Sudoku solver!");
		System.out.println("Input the numbers for the Sudoku problem with 0 representing empty numbers.");
		System.out.println("No spaces between the numbers, and press enter after each line.");
		Scanner console = new Scanner(System.in);
		
		//fill out the sudoku initial board
		for (int i = 0; i < 9; i++) {
			String line = console.nextLine();
			for (int j = 0; j < 9; j++) {
				char c = line.charAt(j);
				board[i][j] = Character.getNumericValue(c);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Starting Board:");
		for(int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				System.out.print(board[j][k]+ " ");
			}
			System.out.println();
		}
		
	}
	

	
	private static boolean isNumberOk(SudokuElement element, int number) {
		int rownumber = element.getRow(); //check rows
		for (int i = 0; i < 9; i++) {
			if (board[rownumber][i] == number) {
				return false;
			}
		}
			
		int columnnumber = element.getColumn(); //check columns
		for (int i = 0; i < 9; i++) {
			if (board[i][columnnumber] == number) {
				return false;
			}
		}
		
		int areaNumber = areaNumberMatrix[rownumber][columnnumber];   //check its own square, find which square it belongs to
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (areaNumberMatrix[i][j] == areaNumber) {
					if (board[i][j] == number) {
						return false;
					}
 				}
 			}
		}
		
		
		return true; //if all false, return true
	}

}
