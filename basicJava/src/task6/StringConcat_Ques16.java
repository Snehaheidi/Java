package task6;

import java.util.Scanner;

public class StringConcat_Ques16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str1 = new String[n];
		System.out.println("Enter the 1st String Array : ");
		for(int i=0;i<n;i++) {
			str1[i] = scanner.next();
		}
		int n1 = scanner.nextInt();
		String[] str2 = new String[n];
		System.out.println("Enter the 1st String Array : ");
		for(int i=0;i<n1;i++) {
			str2[i] = scanner.next();
		}
		findResult(str1,n,str2,n1);
		scanner.close();
	}

	private static void findResult(String[] str1, int n, String[] str2, int n1) {
		String temp1 ="",temp2="";
		for(int i=0;i<n;i++) {
			temp1 += str1[i];
		}
		for(int i=0;i<n1;i++) {
			temp2 += str2[i];
		}
//		System.out.println(temp1+" "+temp2);
		if(temp1.equals(temp2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
