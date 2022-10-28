package task6;

import java.util.Scanner;

public class ConvertToWave_Que2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findConvertToWave(arr,n);
		scanner.close();
	}

	private static void findConvertToWave(int[] arr, int n) {
		for(int i=0,j=1;j<n;i+=2,j+=2) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
