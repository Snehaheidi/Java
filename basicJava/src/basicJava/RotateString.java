package basicJava;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		int result = findResult(a,b);
		System.out.println(result);
		scanner.close();
	}
	public static int findResult(String a,String b) {
		int n = a.length();
		int n1 = b.length(),j=0;
		if(n==n1) {
			for(int i=2;i<n;i++) {
			  if(a.charAt(i)==b.charAt(j)) {
				  j++;
			  }
			}
			for(int i=0;i<2;i++) {
				if(a.charAt(i)==b.charAt(j)) {
					j++;
				}
			}
			if(n==j) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			return 0;	
		}
	}
}
//OUTPUT:
/*
amazon
azonam
1
*/