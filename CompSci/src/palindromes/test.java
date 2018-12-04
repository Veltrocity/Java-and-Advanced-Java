package palindromes;

import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word to be checked");
		String test = "";
		test = input.nextLine();
		if (strPalin(test))
				System.out.println(test + " Is a palindrome");
			else
				System.out.println(test + " Is not a palindrome.");
		
		
		

	}
	public static boolean strPalin(String strP){
		if(strP.length() == 0 || strP.length() == 1){
			return true;
		}
		if(strP.charAt(0) == strP.charAt(strP.length() - 1)){
			return strPalin(strP.substring(1, strP.length()-1));
		}
		return false;
		
	}
	public static boolean palin(String p){
		if (p.length() == 0 || p.length() == 1){
			return true;
		}
		char[] tempArr [];
		int i = 0;
		for (int i = 0; 0 <= p.charAt(p.length()); i--);
		char [] palin = p.toCharArray();
		tempArr[i] = palin[i];
	}

}
