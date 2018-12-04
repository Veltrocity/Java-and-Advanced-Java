// Programmer: Austin Castellino
//Class: CompSci 75 TTh
//Assignment #2 Word Game
//Due: 9/13/2015
//Take information for the user.
//Then prints it out in a paragraph.

import java.util.Scanner;


public class ComSci3 {

	public static void main(String[] args) {
		
		//Variables being used in the Program
		String NAME;
		int AGE;
		String CITY;
		String COLLEGE;
		String PROFESSION;
		String ANIMAL;
		String PETNAME;
		String x;
		
		
		Scanner NG = new Scanner(System.in); //New Scanner Object. Named NG
		System.out.print("\nEnter a name: \r");
		NAME = NG.nextLine(); // Enter a String value for NAME
		
		
		System.out.print("\nEnter a Age: \r");
		AGE = NG.nextInt(); //Enter a int value for AGE
		x = NG.nextLine(); //Get the Scanner Back to taking in String Values
		
		System.out.print("\nEnter a City: \r");
		CITY =  NG.nextLine(); //Enter a String value for CITY

		
		System.out.print("\nEnter a College: \r");
		COLLEGE = NG.nextLine(); // Enter a String value for COLLEGE
		
		
		System.out.print("\nEnter a Profession: \r");
		PROFESSION = NG.nextLine(); // Enter a String Value for Profession
		
		System.out.print("\nEnter a Animal: \r");
		ANIMAL = NG.nextLine(); //Enter a String Value for ANIMAL
		
		System.out.print("\nEnter a Pet Name: \r");
		PETNAME = NG.nextLine(); // Enter a String value for PETNAME
		
		
		System.out.println("\n\tThere once was a person named " + NAME + 
				" who live in " + CITY + ". \n\t" + "At the age of " + AGE + ", " + NAME +
				" went to college at " + COLLEGE + ". \n\t" + NAME + " graduated and went to work as a "
				+ PROFESSION + ". \n\tThen, " + NAME + " adopted a(n)" + ANIMAL + " named " +
				PETNAME + ". \n\tThey both lived happily ever after!");
	}
	

}
