package leedcode;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		for(int i=0;i<num.length();i++) {
			char ch = num.charAt(i);
			switch(ch){
			case 'I':
				result+=1;
				break;
			case 'V':
				result+=5;
				break;
			case 'X':
				result+=10;
	             break;
			case 'L':
				result+=50;
				break;
			case 'C':
				result+=100;
				break;
			case 'D':
				result+=500;
				break;
			case 'M':
				result+=1000;
				break;
				
			}
		}
		System.out.println("Integer Value is : "+result);
		scanner.close();
	}
}
