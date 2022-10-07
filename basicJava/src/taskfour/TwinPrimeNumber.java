package taskfour;

import java.util.Scanner;

public class TwinPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 100;
		findTwinPrime(n);
		scanner.close();
	}

	private static void findTwinPrime(int n) {
		for(int i=2;i<n;i++) {
			boolean result = findPrime(i);
			if(result) {
				int c = i+2;
				boolean result1 = findPrime(c);
//				System.out.println(c+" "+result1);
				if(result1) {
					System.out.println("("+i+","+c+")");
				}

			}
		}
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
