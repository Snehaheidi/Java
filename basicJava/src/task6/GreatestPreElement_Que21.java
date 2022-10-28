package task6;

import java.util.Scanner;

public class GreatestPreElement_Que21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findTheResult(arr,n);
		scanner.close();
	}

	private static void findTheResult(int[] arr, int n) {
		int max =arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>=max) {
				max = arr[i];
				System.out.print(max+" ");
			}
		}
	}
}
