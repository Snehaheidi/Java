package task6;

import java.util.Scanner;

public class LengthOfLongestSubArray_QUe5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		findTheResult(arr,n,k);
		scanner.close();
	}

	private static void findTheResult(int[] arr, int n,int k) {
		int count = 0 , sum = 0 , maxCount = 0;
		for(int i=0;i<n;i++) {
			sum = arr[i];
			if(sum==k) {
				count=1;
				if(maxCount<count) {
					maxCount=count;
//					sum = 0;
				}
			}
			for(int j=i+1;j<n;j++) {
				sum += arr[j];
				if(sum==k) {
					count=j-i+1;
					if(maxCount<count) {
						maxCount=count;
					}
				}
			}

		}
		System.out.println("Length of The sub-array Count : " + maxCount);
	}
}
