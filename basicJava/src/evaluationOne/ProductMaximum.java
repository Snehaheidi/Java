package evaluationOne;

import java.util.Scanner;

public class ProductMaximum {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findProductMax(n,arr);
		scanner.close();
	}
	private static void findProductMax(int n, int[] arr) {
		int max = 0,index1 = 0,index2 = 0,index3 = 0;
		boolean flag = false;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(flag == false ) {
						max = arr[i] * arr[j] * arr[k];
						index1 = i;
						index2 = j;
						index3 = k;
						flag = true;
					}
					int multi = arr[i] * arr[j] * arr[k];
					if(max<multi) {
						max = multi;
						index1 = i;
						index2 = j;
						index3 = k;
					}
				}
			}
		}
		System.out.println(max);
		System.out.println(arr[index1]+","+arr[index2]+","+arr[index3]);
	}
}
