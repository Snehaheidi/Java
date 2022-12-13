package basicJava;

import java.util.Scanner;

public class UnbalancedParatheses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int n = s.length();
		char[] str = new char[n];
		for(int i=0;i<n;i++) {
			str[i] = s.charAt(i);
		}
		unBalancedParatheses(str,n);
		scanner.close();
	}

	private static void unBalancedParatheses(char[] str, int n) {
		int openCount = 0 , closeCount = 0;
		for(int i=0;i<n;i++) {
			if(str[i]=='(') {
				openCount++;
			}
			if(str[i]==')') {
				closeCount++;
			}
		}
	}

}
