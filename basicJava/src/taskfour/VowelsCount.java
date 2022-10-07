package taskfour;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int result = findVowelsCount(str);
		System.out.println("The Total vowels in given String is : "+result);
        scanner.close();
	}

	private static int findVowelsCount(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
				count++;
			}
			else if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				count++;
			}
			else
				continue;
		}
		return count;
	}

}
