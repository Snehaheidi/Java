package task6;

import java.util.Scanner;

public class IndexExtraElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n-1];
		System.out.println("Enter the 1st array element");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.println("Enter the element");
		for(int j=0;j<arr2.length;j++) {
			arr2[j] = scanner.nextInt();
		}
		findIndex(arr1,arr2);
		scanner.close();
	}
	private static void findIndex(int[] arr1, int[] arr2) {
		int index = 0;
		for(int i=0;i<arr1.length-1;i++) {
             if(arr1[i]!=arr2[i]) {
            	 index = i;
            	 break;
             }
		}
		if(index == 0) {
			index = arr1.length-1;
		}
		System.out.println(index);
	}
}
