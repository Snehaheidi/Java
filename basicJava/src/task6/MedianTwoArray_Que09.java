package task6;
import java.util.Scanner;

public class MedianTwoArray_Que09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = scanner.nextInt();
		}
		int n1 = scanner.nextInt();
		int[] arr2 = new int[n1];
		for(int i=0;i<n1;i++) {
			arr2[i] = scanner.nextInt();
		}
		findMedian(arr1,arr2,n,n1);
       scanner.close();
	}

	private static void findMedian(int[] arr1, int[] arr2,int n1,int n2) {
		int result[] = new int[n1+n2];
		int i=0;
		for(i=0;i<n1;i++) {
			result[i] = arr1[i];
		}
		for(int j=0;j<n2;j++) {
		    result[i++] = arr2[j];
		}
//		System.out.println(Arrays.toString(result));
		for(int k=0;k<result.length;k++) {
			for(int j=k+1;j<result.length;j++) {
				if(result[k]>result[j]) {
					int temp = result[k];
					result[k] = result[j];
					result[j] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(result));
		float median;
		if(result.length%2==0) {
			median =(float) ((result[result.length/2] + result[result.length/2 - 1] ) / 2.0) ; 
		}
		else {
			median = result[result.length/2];
		}
		System.out.println(median);
	}

}
