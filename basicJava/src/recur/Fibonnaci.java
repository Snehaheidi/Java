package recur;

import java.util.Scanner;

public class Fibonnaci {
	static int n1=0,n2=1,n3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.print(n1+" "+n2);
		recurs(n-2);
	}
	private static int recurs(int n) {
	  if(n<0) {
		  return n;
	  }
	  else {
		  n3 = n1 + n2;
		  n1 = n2;
		  n2 = n3;
		  System.out.print(" "+n3);
		  return recurs(n-1);
	  }

	}
}
