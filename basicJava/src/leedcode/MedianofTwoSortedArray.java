package leedcode;

import java.util.Scanner;

public class MedianofTwoSortedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i] = scanner.nextInt();
		}
		int n2 = scanner.nextInt();
		int[] arr2 = new int[n2];
		for(int j=0;j<n2;j++) {
			arr2[j] = scanner.nextInt();
		}
		findMedian(arr1,n1,arr2,n2);
	}
	private static void findMedian(int[] arr1, int n1, int[] arr2, int n2) {
		int[] result = new int[n1+n2];
		float median;
		for(int i=0;i<n1;i++) {
			result[i] = arr1[i];
		}
		int k = n1;
		for(int j=0;j<n2;j++) {
			result[k++] = arr2[j];
		}
	    
		int n = result.length; 
		int[] find = findSort(result,n);
		for(int i=0;i<n;i++) {
			System.out.print(find[i]+" ");
		}
		if(n%2!=0) {
			median = find[n/2];
		}
		else {
			int temp = find[n/2] + find[n/2] - 1;
			median = temp / 2;
		}
		System.out.println("Median is : "+median);
	}

	private static int[] findSort(int[] result,int n) {
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(result[i]>result[j]) {
					temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		return result;
	}
}
 