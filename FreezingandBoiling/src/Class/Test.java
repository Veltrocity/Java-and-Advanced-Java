//Austin Castellino
//CompSci 75 TTH
//10/15/15
//Assignment 5
//Create a program that has the user enter a temperature
//and prints out if water, oxygen, ethyl is boiling/freezing
//usage of classes and methods
package Class;

import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Text file
		PrintWriter writer = new PrintWriter("Freezing-Boiling.txt");
		System.out.println("Please enter a temperature: ");
		int temp = input.nextInt();
		writer.print("Please enter a temperature: " + temp + "\n");
		
		//New object from FreezingBoilingPoints class
		FreezingBoilingPoints points = new FreezingBoilingPoints(temp);
		System.out.print(points.TempInfo());
		writer.println(points.TempInfo());
		
		writer.close();

	}

}
