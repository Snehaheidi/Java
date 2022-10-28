package task6;

import java.util.Scanner;

public class UnionOfTwoArray_Que4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i] = scanner.nextInt();
		}
		int n2 = scanner.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i] = scanner.nextInt();
		}
		if(n1>=n2) {
			findUnionOfArray(arr1,n1,arr2,n2);
		}
		else {
			findUnionOfArray(arr2,n2,arr1,n1);
		}
		scanner.close();
	}

	private static void findUnionOfArray(int[] arr1, int n1, int[] arr2, int n2) {
		int[] result = new int[256];
		int  k=0,i,j = 0,flag;
		for(i=0;i<n1;i++) {
			flag =0;
			for(j=0;j<n2;j++) {
				if(arr1[i]==arr2[j]) {
					result[k++] = arr1[i];	
					flag++;
				}
			}
			if(flag == 0) {
				result[k++] = arr1[i];
			}
		}
		for(int s=0;s<result.length;s++) {
			if(result[s]!=0) {
				System.out.print(result[s]+" ");
			}
		}
		
	}

}
