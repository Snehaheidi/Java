package evaluationOne;

import java.util.Scanner;

public class AddInteger {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
	   arr[i] = scanner.nextInt();
	}
	findResult(n,arr);
	scanner.close();
	}

	private static void findResult(int n, int[] arr) {
		int temp = 0,i=0;
		while(n!=i) {
			int rem = arr[i];
			temp = temp * 10 + rem;
			i++;
		}
// 	System.out.println(temp);
		int result = temp + 1;
		int n1 = result , digitcount = 0;
		while(n1!=0) {
			n1 /=10;
			digitcount++;
		}
//	 	System.out.println(digitcount);
		int[] digit = new int[digitcount];
		for(int j=digitcount-1;j>=0;j--) {
			int rem1 = result % 10;
			digit[j] = digit[j] * 10 + rem1;
			result /= 10;
		}
//		System.out.println(Arrays.toString(digit));
		for(int k=0;k<digitcount;k++) {
			System.out.print(digit[k]+" ");
		}
	}
}
