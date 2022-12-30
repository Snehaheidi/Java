package evaluationFinal;

import java.util.Scanner;

public class LongestSubString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("Longest SubString is : "+longestString(str));
		scanner.close();
	}
	private static int longestString(String str) {
		int max=0;
		int n = str.length();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(substring(str,i,j)) {
					max = Math.max(max, j-i+1);
				}
			}
		}
		//System.out.println(result);
		return max;
	}

	private static boolean substring(String s ,int i, int j) {
		boolean[] visited = new boolean[26];
		for(int k=i;k<=j;k++) {
			if(visited[s.charAt(k)-'a']==true) {
				return false;
			}
			else {
				visited[s.charAt(k)-'a'] = true;
			}
		}
		return true;
	}
}
