package task6;

import java.util.Scanner;

public class ThirdLargestElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findThiredElement(arr,n);
		scanner.close();
	}

	private static void findThiredElement(int[] arr,int n) {
		int k=3;
		if(n>2) {
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println(arr[k-1]);
		}
		else {
			System.out.println("-1");
		}
	}
}