// Programmer: Austin Castellino
//Class: CompSci 75 TTh
//Test 1
//Due: 10/1/2015
//Plans user IRA account

package Assignments;

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Test1 {

	public static void main(String[] args) throws IOException {
		//variables needed
		double principal;
		double AvgInc;
		double years = 2000;
		double total = 0;
		
		
		Scanner input = new Scanner(System.in); //user input
		PrintWriter writer = new PrintWriter("IRA Future.txt"); //print to a text file
		DecimalFormat df = new DecimalFormat("#####.00");
		
		System.out.println("Hi welcome to the IRA retirement program.");//intro
		writer.println("Hi welcome to the IRA retirement program.");
		
		System.out.println("How much money are you starting out with?: ");//prompts user houw much money to enter
		
		
		principal = input.nextDouble();
		if (principal < 2000){ // checks to see if principal is more than 2000
			System.out.println("Please Enter a higher number");
			principal = input.nextDouble();
		}
		writer.println("How much money are you starting out with?: " + principal);
		
		System.out.println("What is the average annual growth rate?: ");
		AvgInc = input.nextDouble();
		if (AvgInc <= 0){//Avginc needs to be bigger than 0
			System.out.println("Please enter a number higher than 0");
			AvgInc = input.nextDouble();
		}
		writer.println("What is the average annual growth rate?: " + AvgInc);
		AvgInc = AvgInc / 100;
		
		System.out.println("How many years do you want your investment to grow for?: ");
		years = input.nextDouble();
		if (years < 2){//years needs to be more than 2
			System.out.println("Please enter a number thats more than 2: ");
			years = input.nextDouble();
		}
		writer.println("How many years do you want your investment to grow for?: " + years + "\n");
		System.out.println("Year----------Money\n");
		writer.println("Year----------Money\n");
		for(int i = 0; i < years; i++){
			principal += principal * AvgInc;
			total = principal;
			System.out.println((i+1) + "----------"  + df.format(total));
			writer.println((i+1) + "----------"  + df.format(total));
			
		}
		writer.close();
		

	}

}
