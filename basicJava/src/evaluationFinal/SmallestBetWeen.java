package evaluationFinal;

import java.util.Scanner;

public class SmallestBetWeen {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {	
		int z=0,k=0;
		String str = scanner.nextLine();
		str+=" ";
		int n = str.length();
//		char[] ch = new char[n];
//		for(int i=0;i<n;i++) {
//			if(str.charAt(i))
//			ch[i] = str.charAt(i);
//		}
		String txt1 = scanner.nextLine();
		String txt2 = scanner.nextLine();
		String[] tempstr = new String[n];
		for(int i=0;i<n;i++){
			if(str.charAt(i)==' ') {
				tempstr[k] = str.substring(z,i);
				//System.out.println(tempstr[k]);
				z=i+1;
				k++;
			}
		}
	
		findResult(tempstr,k,txt1,txt2);
		scanner.close();
	}

	private static void findResult(String[] tempstr,int k,String txt1,String txt2) {
		int count=0;
		for(int i=0;i<k;i++) {
			String temp = tempstr[i];
			if(txt1.equals(temp)) {
				//System.out.println(i);
                for(int j=i;j<k;j++) {
                	String temp1 = tempstr[j];
                	if(txt2.equals(temp1)) {
                		//System.out.println(j);
                		break;
                	}
                	else {
                		count++;
                	}
                }
			}
		}
		if(count>0) {
			System.out.println((count-1));
		}
		else {
			System.out.println("-1");
		}
	}
}
