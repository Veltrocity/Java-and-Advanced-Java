// Programmer: Austin Castellino
//Class: CompSci 75 TTh
//Assignment #3 ISP Plan Selector
//Due: 9/22/2015
//Makes a Isp plan selector.
//Takes in the plan and hours entered by the user and calculates the total.
//Uses if-statements to pick between different plans.


import java.util.Scanner;


public class ISP {

	public static void main(String[] args) {
		//Intro for the program and what the user should expect.
		System.out.println("\tHi! Welcome to Austin's ISP plan selector." +
				"\nIn a moment you will be prompted with our current plans and current rates. \n" +
				"Please picked a plan by entering: A, B, or C for the plan. ");
				
		Scanner UserInput = new Scanner(System.in); //Scanner for string/Plan inputs
		Scanner time = new Scanner(System.in); //Scanner for double/hours and total inputs.
		String planSelect; //string bar, that correlates to the plans right below
		double A = 9.95; //plan A
		double B = 13.95; //plan B
		double C = 19.95; // plan C
		double hours; // amount of hours entered by the user.
		double total = 0; // add up the total amount of hours with additional charges
		
		
		
		System.out.println("Plan A: " + A + ", plan B: " + B + ",or plan C " + C);
		System.out.println("\nPlease enter the plan you would like.");
		planSelect = UserInput.nextLine(); // Enter which plan you'd like
		
		
		
		System.out.println("Please enter the amount of hours you used throughout the month. ");
		hours = time.nextDouble(); //Enter the amount of hours used
		
		
		
		
		if (planSelect.equals("a") || planSelect.equals("A")) //the conditional for plan A
		{
			
			System.out.println("You have choosen Plan A for " + A + "$ the month.");// shows what plan and how much it is for the month
			System.out.println("Hours used: " + hours);
			
			
			if (hours >= 10) // checks to see if the user went over the amount of hours allotted
			{
				hours = (hours - 10) * 2; //calculates additional charges
				total = hours + A; // adds the plan's charges and additional charges for the month.
			}
		}
			else if (planSelect.equals("b") || planSelect.equals("B")) //the conditional for plan B
			{
				
				
				System.out.println("You have choosen Plan B for " + B + "$ a month."); //Same format as "Plan A"
				System.out.println("Hours used: " + hours);
				
				
				if (hours >= 20)
				{
					hours = (hours - 20) * 1;
					total = hours + B; 
					
				}
				
			}
			else if (planSelect.equals("c") || planSelect.equals("C")) //the conditional for plan C
			{
				
				
				System.out.println("You have choosen Plan C for " + C + "$ the month." );
				
				
				if( hours > 0)
				{
					hours = 0; //sets hours equal to zero so no additional charges will be made.	
				}
				total = C; // Has the total without having hours being calculated.
				
			}
			else System.out.println("Invalid Input"); // for any string or double values entered that don't met the conditionals.
			
		
			System.out.println("Your additional charges are: " + hours + "$");
			System.out.println("With a total charge of " + total + "$ for the month");		

	}

}
