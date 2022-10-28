package validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String regexPattern = "^[A-Za-z0-9+_.]+@(.+)$";
		boolean result = Pattern.matches(regexPattern,sentence);
		if(result) {
			System.out.println("Given Email Address is Valid");
		}
		else {
			System.out.println("Given Email Address is Not valid");
		}
		scanner.close();
	}
}
/*
 *		String pattern1 = "[^abc]";
		boolean result = Pattern.matches(pattern1,sentence);
 */
