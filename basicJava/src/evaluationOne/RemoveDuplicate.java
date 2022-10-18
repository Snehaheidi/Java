package evaluationOne;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
		   arr[i] = scanner.nextInt();
		}
		findRemoveArray(n,arr);
		scanner.close();
	}

	private static void findRemoveArray(int n, int[] arr) {
		//Remove Duplicate
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[j] = 0;
				}
			}
		}
		int k=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+",");
				k++;
			}
		}
		for(int j=k;j<n;j++) {
			System.out.print(","+"_");
		}
	}

}
