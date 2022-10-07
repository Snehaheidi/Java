package basicJava;
import java.util.Scanner;

class QuadraticEquation {
	public static void main(String[] args) {
		double a,b,c,discriminat,r1,r2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a & b & c value = ");
		a=scanner.nextDouble();
		b=scanner.nextDouble();
		c=scanner.nextDouble();
		scanner.close();
		if (a==0){
			System.out.println("Invalid ");
		}
		discriminat = (b*b)-(4*a*c);
		if(discriminat>0){
			r1 = (-b + Math.pow(discriminat,0.5))/(2*a);
			r2 = (-b - Math.pow(discriminat,0.5))/(2*a);
			System.out.println("The roots are = " +r1+ " , " +r2);

		}
		else if(discriminat==0){
		  r1 = -b/(2*a);
			System.out.println("The root are = "+r1);
		}
	}
}
