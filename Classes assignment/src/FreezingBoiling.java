import java.util.*;
import java.io.*;
import java.util.Scanner;
public class FreezingBoiling {

	public static void main(String[] args) throws IOException {
		Scanner scan= new Scanner(System.in);
		PrintWriter text = new PrintWriter("Freezing/Boiling.txt");
		
		System.out.println("Please enter a temperature: ");
	    int temperature = scan.nextInt();

	    FreezingBoilingPoints temp1 = new FreezingBoilingPoints(temperature );
	    System.out.println(temp1.showTempinfo());
		

	}
	

}

