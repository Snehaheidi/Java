package validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneValid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String regexPattern = "(0|91)?[6-9]{1}[0-9]{9}";
		boolean result = Pattern.matches(regexPattern,sentence);
		if(result) {
			System.out.println("Phone Number Valid");
		}
		else {
			System.out.println("Phone Number Not valid");
		}
		scanner.close();
	}
}
