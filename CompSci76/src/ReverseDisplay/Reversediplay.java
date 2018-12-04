//Austin Castellino
//CompSci 76 TTh 6-9
//Assignment #2 18.12
//Use Recursion and helper methods

package ReverseDisplay;

import java.io.*;
import java.util.*;

public class Reversediplay {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a word");
		String s = input.nextLine();
		//user input
		rDisplay(s);
		//call method
	}
	
	public static void rDisplay(String s){
		//ReverseDisplay Method
		rDisplay(s, s.length() - 1	);
		
	}
	public static void rDisplay(String s, int high){
		if (high >= 0){
			//makes sure "high" does not go below zero
			System.out.print(s.charAt(high));
			//prints the user input in reverse
			rDisplay(s, high - 1);
			//reduces char index by 1
		}
	}
}


