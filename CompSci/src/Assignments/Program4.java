// Programmer: Austin Castellino
//Class: CompSci 75 TTh
//Assignment #4 Population Growth
//Due: 9/29/2015
//Population Growth
//Takes user information.
//Initial population, Days we want to increase, and percent we want to increase it by everyday
//shows it in a text file.
//Uses if-statements to pick between different plans.

package Assignments;
import java.util.*;
import java.io.*;


public class Program4 {

	public static void main(String[] args) throws IOException {
		System.out.println("\tWelcome to Population Growth Program.\t\n");
		
		
		Scanner input = new Scanner(System.in); //Scanner for user input.
		PrintWriter writer =  new PrintWriter("Population.txt"); // PrintWriter for results in a ".txt" file
		
		double pop; //starting population
		double total = 0; // total population after calculations
		double percent = 0; // daily population increase
		double days = 0; //amount of days the user wants to have the population grow
		
		//Enter the initial population.
		//its shown on the console and the text file, due to PrintWriter class being used
		System.out.print("Please enter the intial Population: "); 
		pop = input.nextDouble();
		writer.println("Please enter the intial Population: " + pop);
		//Make sure the population is bigger than 2
		if (pop < 2){
			System.out.println("Please enter a number greater than or equal to 2: \n");
			pop = input.nextDouble();
			writer.println("Please enter a real number: \n");
		}
		
		//The daily population increase
		System.out.print("Please Enter the Daily Population Increase: ");
		percent = input.nextDouble();
		writer.println("Please Enter the Daily Population Increase: " + percent);
		//Checks to see if "percent" is a positive number or not
		if (percent < 0){
			System.out.println("Enter the Daily Population Increase: ");
			writer.println("Enter the Daily Population Increase: \n");
			percent = input.nextDouble();
			
		}
		percent = percent / 100; //makes the amount in terms of decimals i.e, 0.1, 0.2, 0.5....etc

		//Amount of days the user wants the population to grow for
		System.out.print("Enter the amount of days the Population will be increasing for: ");
		days = input.nextDouble();
		writer.println("Enter the amount of days the Population will be increasing for: " + days);
		//Checks to see if "days" is 1 or not
		if (days <= 1){
			System.out.println("Please enter a number greater than 1.\n");
			writer.println("Please enter a number greater than 1.\n");
			days = input.nextDouble();
		}
		
		for (int i = 0; i < days; i++ ){ // the loop to let the population increase.
			
			pop += pop * percent;
			total = pop;
			System.out.println( "Days: " + (i + 1) + "-----" +total);
			writer.println( "Days: " + (i + 1) + "-----" +total); 
			
			
			
		}
		writer.close(); //close PrintWriter	
	}
}
