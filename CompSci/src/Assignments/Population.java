package Assignments;

import java.util.*;

public class Population {

	public static void main(String[] args) {
		double intialpop = 0;
		double dayInc = 0;
		double Numday = 0;
		double total = 0;



		//Create a Scanner object for keyboard input.
		Scanner KB = new Scanner(System.in);


		//accept initial user input here

		while (intialpop < 2)
		{
		System.out.print("Please enter a number that is greater than 1 for the Population Size: ");
		intialpop = KB.nextDouble();
		}

		while (dayInc < 0)
		{
		System.out.print("Enter a positive integer for the Population Size Increase: ");
		dayInc = KB.nextDouble();
		}

		//do the same while loop for numberOfDays as a positive number > 0


		total = intialpop;
		dayInc = dayInc / 100;

		for(int i = 0; i < Numday; i++)
			{
				System.out.println("Day " + i);
				System.out.println("Number " + total);
				total = total * dayInc;
			}
		}
		 

}
