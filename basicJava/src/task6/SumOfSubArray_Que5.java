package task6;

import java.util.Scanner;

public class SumOfSubArray_Que5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findSumofSubArray(arr,n);
		scanner.close();
	}
	private static void findSumofSubArray(int[] arr, int n) {
		
		
	}

}
