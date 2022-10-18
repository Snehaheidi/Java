package evaluationOne;

import java.util.Scanner;

public class SumOfPairs {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		findSumPair(n,arr,k);
		scanner.close();
	}
	private static void findSumPair(int n, int[] arr,int k) {
		//Remove Duplicate
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[j] = 1000;
				}
			}
		}
		boolean flag = false;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]!=1000 && arr[j]!=1000) {
					int sum = arr[i]+arr[j];
					if(sum==k) {
						System.out.print("("+arr[i]+","+arr[j]+")");
						flag = true;
					}
				}	
			}
		}
		if(flag==false) {
			System.out.println("No pair exists for "+k);
		}
	}
}
