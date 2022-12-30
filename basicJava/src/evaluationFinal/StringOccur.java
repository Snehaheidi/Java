package evaluationFinal;

import java.util.Scanner;

public class StringOccur {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int n = str.length();
		int[] count = new int[256];
		for(int i=0;i<n;i++) {
			//int index = str.charAt(i)-96;
			//System.out.println(index);
			count[str.charAt(i)]++;
		}
		char[] ch = new char[n];
		for(int i=0;i<n;i++) {
			int flag = 0;
			ch[i] = str.charAt(i);
			for(int j=0;j<=i;j++) {
				if(str.charAt(i)==ch[j]) {
					flag++;
				}
			}
			if(flag==1) {
				System.out.print(str.charAt(i)+""+count[str.charAt(i)]+" ");
			}
		}
	}
}
