//Internet service Provider
//217
//use if else control form
//at east condition tests
//
import java.text.*;
import java.util.Scanner;





public class ISP {

	public static void main(String[] args) {
		System.out.println("Hi! Welcome to Austin's ISP plan selector." +
		"\n In a moment you will be prompted with our current plans and current rates. \n" +
		"Please picked a plan by entering: A, B, or C for the plan. ");
		
		Scanner UserInput = new Scanner(System.in);
		Scanner time = new Scanner(System.in);
		String planSelect;
		double A = 9.95;
		double B = 13.95;
		double C = 19.95;
		double hours;
		planSelect = UserInput.nextLine();
		hours = time.nextDouble();
		
		
		 if (planSelect == "A")
		        if (hours <= 10) { 
		              System.out.println ("Your total charges are: " + A);
		        }
//		else if (planSelect == "b") 
//		{
//			System.out.println("you have Choosen plan B: " + B + "$");
//			hours = (hours - 10) * 2;
//			System.out.println(hours);	 
//			
//		}
		
		return;

	}

}
