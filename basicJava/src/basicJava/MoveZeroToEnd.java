package basicJava;
//import static java.lang.Math.*;
//import java.util.*;
//import java.util.Scanner;

public class MoveZeroToEnd //extends Object
{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
//		int result = abs(n);
		findResult(arr,n);
      scanner.close();
	}
   public static void findResult(int[] arr,int n) {
	   int k=1;
	   for(int i=0;i<n-1;i++) {
		   if(arr[i]==arr[k] && arr[i]!=0) {
			   arr[i] = arr[i] * 2;
			   arr[k] = 0;
		   }
		   k++;
	   }
	 int count = 0;
	 for(int j=0;j<n;j++) {
	 	   if(arr[j]!=0) {
	 		   arr[count++] = arr[j];
	 	   }
	 }
	 while(count<n) {
	 	   arr[count++] = 0;
	 }
	   printArray(arr,n);
   }
   private static void printArray(int[] arr,int n){
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
   }
}

//OUTPUT:
/*
 5
2 2 0 0 4
4 4 0 0 0 
 */
