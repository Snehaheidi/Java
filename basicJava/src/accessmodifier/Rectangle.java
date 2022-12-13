package accessmodifier;

import java.util.Scanner;

public class Rectangle {
     int length , breath;
     Rectangle(int length,int breath){
    	 this.length = length;
    	 this.breath= breath;
     }
	public static void main(String[] args) {
		//static int a = 10; --> static methdod inside static varible can't declare
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int b = scanner.nextInt();
		Rectangle r1 = new Rectangle(l,b);
		int result = r1.Area();
		System.out.println("Rectangle One : "+result);
		int l1 = scanner.nextInt();
		int b1 = scanner.nextInt();
		Rectangle r2 = new Rectangle(l1,b1);
		int result1 = r2.Area();
		System.out.println("Rectangle Two : "+result1);
		scanner.close();
	}
	public int Area() {
		return length*breath;
	}

}
