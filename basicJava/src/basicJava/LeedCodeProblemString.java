package basicJava;

import java.util.Scanner;

public class LeedCodeProblemString {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int n = str.length()/2;
		int count = 0, count1 =0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i) =='i' || str.charAt(i) =='u') {
				
				count++;
			}
		}
		for(int i=n;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i) =='i' || str.charAt(i) =='u') {
				
				count1++;
			}
		}
		if(count==count1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		scanner.close();
	}

}
