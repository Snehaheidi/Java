//SWAPPING TWO NUMBERS 

package basicJava;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int a = scanner.nextInt();
	 int b = scanner.nextInt();
	 System.out.println("Before Swapping a="+a+", b="+b);
	 a += b;
	 b = a - b;
	 a -= b;
	 System.out.println("After Swapping a="+a+", b="+b);
	 scanner.close();
	}
}
/*
OUTPUT: 
10
5
Before Swapping a=10, b=5
After Swapping a=5, b=10 
*/