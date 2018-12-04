// Programmer: Austin Castellino
//Class: CompSci 75 TTh
//Assignment #8 Array Operations
//Due: 11/3/2015
//Explore the uses of 2D Arrays
//Has output printed in a Text File

package Assignments;

import java.io.*;
import java.text.DecimalFormat;

public class ArrayOperations {
	
	// Total of all the array values
	public static double getTotal(double[][] array) {
	    double total = 0;

	    for (int row = 0; row < array.length; row++) {
	        for (int col = 0; col < array[row].length; col++) {
	            total += array[row][col];
	        }
	    }

	    return total;
	}
	
	//Gets the average of all the array values
	public static double getAverage(double[][] array) {
	    return getTotal(array) / getElementCount(array);
	}
	
	//Gets the Row/[0], total
	public static double getRowTotal(double[][] array, int row) {
	    double total = 0;

	    for (int col = 0; col < array[row].length; col++) {
	        total += array[row][col];
	    }

	    return total;
	}
	
	//Gets the col/[1], total
	public static double getColumnTotal(double[][] array, int col) {
	    double total = 0;

	    for (int row = 0; row < array.length; row++) {
	        total += array[row][col];
	    }

	    return total;
	}

	//Highest number in "row"
	public static double getHighestInRow(double[][] array, int row) {
	    double highest = array[row][0];

	    for (int col = 1; col < array[row].length; col++) {
	        if (array[row][col] > highest) {
	            highest = array[row][col];
	        }
	    }
	    return highest;
	}

	//Lowest number in row
	public static double getLowestInRow(double[][] array, int row) {
	    double lowest = array[row][0];

	    for (int col = 1; col < array[row].length; col++) {
	        if (array[row][col] < lowest) {
	            lowest = array[row][col];
	        }
	    }
	    return lowest;
	}

	//
	public static int getElementCount(double[][] array) {
	    int count = 0;

	    for (int row = 0; row < array.length; row++) {
	        count += array[row].length;
	    }
	    return count;
	}

	public static void main(String[] args) throws IOException {

	    double[][] arrOP = { { 77.12, 67.81, 25.64 },
	            { 27.90, 3.14, 12.12, 45.38 } };
	    PrintWriter writer = new PrintWriter("ArrayOperations.txt");
	    DecimalFormat df = new DecimalFormat("###.00");

	    // Outputs the double array.
	    writer.println("Total : " + df.format(getTotal(arrOP)));
	    writer.println("Average : " + df.format(getAverage(arrOP)));

	    writer.println("Total of row 0 : "
	            + df.format(getRowTotal(arrOP, 0)));
	    writer.println("Total of row 1 : "
	            + df.format(getRowTotal(arrOP, 1)));

	    writer.println("Total of col 0 : "
	            + df.format(getColumnTotal(arrOP, 0)));
	    writer.println("Total of col 1 : "
	            + df.format(getColumnTotal(arrOP, 2)));

	    writer.println("Highest in row 0 : "
	            + df.format(getHighestInRow(arrOP, 0)));
	    writer.println("Highest in row 1 : "
	            + df.format(getHighestInRow(arrOP, 1)));

	    writer.println("Lowest in row 0 : "
	            + df.format(getLowestInRow(arrOP, 0)));
	    writer.println("Lowest in row 1 : "
	            + df.format(getLowestInRow(arrOP, 1)));
	    writer.println("Number of Elements: " + getElementCount(arrOP)); 
	    
	    writer.close();

	}

}
