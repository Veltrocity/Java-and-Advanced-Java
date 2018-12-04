//Austin Castellino
//CompSci 75 TTH
//10/29/15
//Assignment 7
//Makes a program to check a driver's test answers
//Use of arrays and print to an outside text file

package Assignments;
import java.util.Scanner;  // Needed for the Scanner class
import java.io.*;	

public class ExamCheck
	{
	public static void main(String[] args) throws IOException
		{
			// Create an array for answers
			char[] ansKey = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'},
				   studentAns = new char[ansKey.length];
			
			//passing score
			double passing = 65.0;
			
			//writer and scanner
			PrintWriter writer = new PrintWriter("DriverExamCheck.txt");
	      	Scanner keyboard = new Scanner(System.in);
			String input;	// To hold a line of input
			char answer;	// To hold a single character;

			writer.println("Please enter the answers in Caps please. Ex: A, B, C, D");
	      	// Ask the user to enter a student's answers.
	      	for (int i = 0; i < ansKey.length; i++)
	      	{
				System.out.print("What is the answer to question #" + (i + 1) + "? ");
		      	input = keyboard.nextLine();
		      	writer.println("What is the answer to question #" + (i + 1) + "? " + input);
		      	studentAns[i] = input.charAt(0);
		 	}

			// See how many answers are correct
		 	System.out.println("Total correct: " + totalCorrect(studentAns, ansKey) );
		 	writer.println("Total correct: " + totalCorrect(studentAns, ansKey));

			//See how many answers are incorrect
		 	System.out.println("Total incorrect: " + totalIncorrect(studentAns, ansKey) );
		 	writer.println("Total incorrect: " + totalIncorrect(studentAns, ansKey));


			//A counter for the missed questions
		 	int[] missedQuestions = questionMissed(studentAns, ansKey);
			printMissedQuest(missedQuestions);


			// what shows up if you pass or fail
			if (passed(studentAns, ansKey, passing) )
				//System.out.print("You passed!");
				writer.println("you Passed");
				else{
					
				System.out.print("You failed");
				writer.println("You failed");

				System.out.println(" Passing is " + passing + "%.");
				writer.println(" Passing is " + passing + "%.");
				}
			writer.close();


		}

		// Returns true if the student passed the exam or false if the student failed.
		private static boolean passed(char[] exam, char[] answers, double passing)
		{
			double percentageCorrect = (totalCorrect(exam, answers) / answers.length * 100);
			return (percentageCorrect >= passing);
		}

		// Returns the total number of correctly answered questions
		private static int totalCorrect(char[] exam, char[] answers)
		{
			int numCorrect = 0;
			for (int i = 0; i < exam.length; i++)
				if (exam[i] == answers[i])
					numCorrect++;

			return numCorrect;
		}

		// Returns the total number of incorrectly answered questions
		private static int totalIncorrect(char[] exam, char[] answers)
		{
			int numcorrect = 0;
			for (int i = 0; i < exam.length; i++)
				if (exam[i] != answers[i])
					numcorrect++;

			return numcorrect;
		}

		//A method that shows which number(s) the user got wrong
		private static int[] questionMissed(char[] exam, char[] answers)
		{
			int[] missedQuestions = new int[exam.length];
			for (int i = 0; i < exam.length; i++)
				if (exam[i] != answers[i])
					missedQuestions[i] = (i+1);

			return missedQuestions;
		}

		// Prints the values in a char array.
		private static void printArray(char[] exam)
		{
			for (int row = 0; row < exam.length; row++)
			{
				System.out.print(exam[row] + " ");
			}
			System.out.println();
		}

		// Prints the values in an array
		 private static void printMissedQuest(int[] missedQ)
		{
			System.out.print("Questions missed: ");
			for (int row = 0; row < missedQ.length; row++)
			{
				if (missedQ[row] != 0)
					System.out.print(missedQ[row] + ", ");
					//writer.println(missedQ[row] + ", ")
				
			}
			System.out.println();
		}
}