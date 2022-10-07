package taskfour;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		float result = findSmallestValue(n1,n2,n3);
		System.out.println("The Smallest Value is : "+result);
		scanner.close();
	}

	private static float findSmallestValue(int n1, int n2, int n3) {
		if(n1<n2) {
			return n1;
		}
		else if(n2<n3) {
			return n2;
		}
		else
			return n3;
	}

}
