package taskfour;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int count = findNoOfWords(s);
		System.out.println("Count : "+count);
		scanner.close();
	}

	private static int findNoOfWords(String s) {
		int count = 1;
		char[] A = s.toCharArray();
		int n=A.length;
		for(int i=0;i<n;i++) {
//			char str = s.charAt(i);
			if(A[i]==' ') {
				count++;	
			}
		}
		return count;
	}

}
