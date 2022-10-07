package taskthree;

import java.util.Scanner;

public class LongestSubString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int number = scanner.nextInt();
		char[] arr = new char[s.length()];
		int count = 1,result = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] += s.charAt(i);
		} 
		int n = arr.length;
		for(int j=0;j<n;j++) {
			if(arr[j]!='0') {
			for(int k=j+1;k<n;k++) {
				if(arr[j]==arr[k]) {
					count++;
					arr[k] = '0';
				}
			 }
			}
			if(count>=number) {
				result += count;
				count = 1;
			}
		}
		System.out.println(result);
		scanner.close();
	}
}
