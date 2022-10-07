package basicJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int value = 0;
	    boolean result = findPrime(number);
	    while(number!=0) {
	    	int rem = number % 10;
	    	value = value * 10 + rem;
	    	number /= 10;
	    }
	   result =  findPrime(value);
		if(result==true) {
			System.out.println("is a Prime Number");
		}
		else {
			System.out.println("is not a Prime Number");
		}
		scanner.close();
	}
   private static boolean findPrime(int n) {
	   boolean flag = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
   }
}
//OUTPUT:
/*
 61
is not a Prime Number
 */
