package taskthree;

import java.util.Scanner;

public class LexicoGraphical {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		removeDuplicate(str);
		scanner.close();
	}
	private static void removeDuplicate(String str) {
		char[] s = str.toCharArray();
		int n = str.length();
		for(int i=0;i<n;i++) {
			s[i] = str.charAt(i);
		}
		String result ="";
		for(int i=0;i<n;i++) {
			if(s[i]!='0') {
				for(int j=i+1;j<n;j++) {
					if(s[i]==s[j]){
					    s[j] = '0';
					}
				}
				result += s[i];
			}
		}
//		System.out.println(result);
		String re = "";
		char[] str1 = result.toCharArray();
		for(int i=0;i<result.length();i++) {
			for(int j=i+1;j<result.length();j++) {
				if(str1[i]>str1[j]) {
					char temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
			re += str1[i];
		}
		System.out.println(re);
	}
}
//OUTPUT:
/*
cbdabcabcdb
abcd
 */
