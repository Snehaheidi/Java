package basicJava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=10;i++) {
		  System.out.println(i+"*"+n+"="+i*n);	
		}
		scanner.close();
	}
}
//OUTPUT:
/*
5
1*5=5
2*5=10
3*5=15
4*5=20
5*5=25
6*5=30
7*5=35
8*5=40
9*5=45
10*5=50

*/