package task5;

import java.util.Scanner;

public class TargetNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findTargetNumber(arr,n, scanner);
        scanner.close();
	}

	private static void findTargetNumber(int[] arr, int n,Scanner scanner) {
		int sum = 0,min = Integer.MAX_VALUE,result=0;
		int target = scanner.nextInt();
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					sum = arr[i] + arr[j] + arr[k];
					int t = Math.abs(sum - target);
					if(min>t) {
					    min = t;
					    result = sum;
					}
				}
			}
		}
		System.out.println(result);
	}

}
