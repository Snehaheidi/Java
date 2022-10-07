package evaluation;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		int target = scanner.nextInt();
		findSubArraySum(arr,n,target);
		scanner.close();
	}
	static int print(int A[],int start,int end) {
		System.out.print("{");
		for(int k=start;k<=end;k++) {
			System.out.print(A[k]+" ");
		}
		System.out.print("}");
		return 1;
	}
	private static void findSubArraySum(int[] arr, int n,int t) {
		int sum;
		int flag=0;
		for(int i=0;i<n;i++) {
			sum = 0;
			for(int j=i;j<n;j++) {
				sum += arr[j];
//				System.out.println(sum);
				if(t == sum) {
					flag=print(arr,i,j);
					break;
				}
				
			}
			if(flag==1) {
				break;
			}
		}
	}
}
