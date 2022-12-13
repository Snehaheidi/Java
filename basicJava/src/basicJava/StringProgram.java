package basicJava;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		// REVERSE STRING IN RECURSION 
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String reverse = reverseString(str);
		System.out.println("Reverse String : "+reverse);
		scanner.close();
	}

	private static String reverseString(String str) {
		int n = str.length();
		if(str== null || n<1) {
			return str;
		}
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
