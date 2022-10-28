package validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		Pattern p = Pattern.compile("com");
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end());
		}
		scanner.close();
	}
}
