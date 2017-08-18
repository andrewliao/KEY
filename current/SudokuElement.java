package sudoku;

import java.util.ArrayList;

public class SudokuElement {
	private int row, column;
	private int currentValue=0;
	private ArrayList<Integer> possibleValues = new ArrayList<Integer>();
	
	public SudokuElement(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public void addPossibleValue(int i) {
		possibleValues.add(i);
	}
	
	public ArrayList<Integer> getaddPossibleValue() {
		return possibleValues;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	
	
}
