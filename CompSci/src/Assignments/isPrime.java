package Assignments;

import java.util.*;
import java.io.*;

public class isPrime {
	
	
	public static boolean isPrime(int n) {
		if (n < 2) return false; //one is not prime, so we can start from 2
		if (n % 2 == 0)
			// n is an even, so return true if n is exactly 2
			return (n == 2);
		for (int i=3; i*i<=n; i+=2)
			if (n % i == 0)
				// i divides evenly into n, so n is not prime
				return false;
		return true;
	}
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		PrintWriter file = new PrintWriter("IsPrime.txt");
		
		//Excercise 13
		//System.out.println("Enter a number to see if it's prime or not");
		//file.println("Enter a number to see if it's prime or not");
		
//		int num;
//		num = input.nextInt();
//		file.println(num);
//		 if (isPrime(num)){
//			 System.out.print("is Prime.");
//			 file.println(num + ", Is Prime ");
//		 }
//		 else{
//			 System.out.println("Is not Prime.");
//			 file.println(num + ", Is not Prime. ");
//		 }
		 
		System.out.println("This program lists the numbers that are prime from 1-100.");
		file.println("This program lists the numbers that are prime from 1-100.");
		 for (int i = 0; i < 100; i++){
			 int count;
			 count = i; //would rather use a different var than i;
			 if (isPrime(count)){ //checks to see if the number is prime
				 System.out.println(count);//prints on console
				 file.println(count); //prints to a text file named "IsPrime.txt"
			 }
		 }
		 
		 file.close();
	}
	
	

}
