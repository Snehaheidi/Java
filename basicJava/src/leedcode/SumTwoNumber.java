package leedcode;

import java.util.Scanner;

public class SumTwoNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++) {
        	nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        findSum(nums,n,target);
	}

	private static void findSum(int[] nums, int n, int target) {
		int[] result = new int[n];
		int k=0;
		for(int i=0;i<n;i++) {
			result[i] = -1;
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int sum = nums[i] + nums[j];
				if(sum==target) {
					result[k++] = i;
					result[k++] = j;
				}
			}
		}
		System.out.print("[");
		for(int i=0;i<result.length;i++) {
			if(result[i]!=-1) {
				System.out.print(result[i]+" ");
			}
		}
		System.out.print("]");	
	}
}
//OUTPUT
/*
n = 4
nums[] = 2 7 11 15
target = 9
sum = [0 1]
*/