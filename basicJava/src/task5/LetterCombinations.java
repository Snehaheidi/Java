package task5;

import java.util.Scanner;

public class LetterCombinations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.nextLine();
		if(s.equals("")){
			System.out.println("[]");
		}
		else {	
			int num=Integer.valueOf(s);
			if(s.length()==1 && s != "1") {
				String c=findString(Integer.valueOf(s));
				for(int i=0;i<c.length();i++) {
					System.out.print(c.charAt(i) + ", ");
				}
			}
		   else {
				String temp[]=new String[s.length()];
				int top=0;
				while(num>0) {
					int t1=num%10;
					String c = findString(t1);
					temp[top++]=c;
					num=num/10;
				}
				findCombi(temp);
			}
		}
		scanner.close();
	}
	private static void findCombi(String[] temp) {
		int n=temp.length;
		System.out.print("[");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				char[] A = temp[i].toCharArray();
				char[] B = temp[j].toCharArray();
				combination(A,B);
			}
		}
		System.out.print("]");
	}
	private static void combination(char[] a, char[] b) {
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<=i;j++) {
    		   System.out.print("\""+b[j]+""+a[i]+"\" ,");
    	   }
    	   System.out.print(" ");
       }
	}
	static String findString(int num) {
		
		switch(num) {
		case 1:
			  return "";
		case 2:
			return "abc";
		case 3:
			return "def";
		case 4:
			return "ghi";
		case 5:
			return "jkl";
		case 6:
			return "mno";
		case 7:
			return "prqs";
		case 8:
			return "tuv";
		case 9:
			return "wxyz";
			default:
				return "";
		}
	}
}
