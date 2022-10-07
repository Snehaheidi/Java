package taskthree;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] num = new String[n];
		for(int i=0;i<n;i++) {
			num[i] = scanner.next();	
		}
		findLargestNumber(num,n);
		scanner.close();
	}
	private static void findLargestNumber(String[] num,int n) {
	    String str="";
//		System.out.println(str);
	  String ab = "";
	  String ba ="";
	  String temp; 
	  for(int i=0;i<n;i++) {
		  for(int j=i+1;j<n;j++) {
			  ab = num[i] + num[j];
			  ba = num[j] + num[i];
			  if(Integer.parseInt(ab)<Integer.parseInt(ba)) {
				  temp = num[i];
				  num[i] = num[j];
				  num[j] = temp;
			  }
		  }
		  str += num[i];
	  }
	  System.out.println(str);
	}
}
//OUTPUT:
/*
 6
99 10 22 33 4 5
9954332210
*/
