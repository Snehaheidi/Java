package task6;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber_Que15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findMissingNumber(arr,n);
		scanner.close();
	}

	private static void findMissingNumber(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int result = 0;
	    for(int i=0;i<n-1;i++) {
	    	if(arr[i]+1!=arr[i+1]) {
	    		result = arr[i]+1;
	    	}
	    }
		System.out.println("The Missing Number : "+result);
	}

}