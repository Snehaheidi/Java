package abstractexample;

public class ImplementClass extends Subtraction{   // More than abstract class cannot be extends 
   private int a = 10,b=30;
	public static void main(String[] args) {
        Subtraction i = new ImplementClass();
        i.subtract();
        i.addition();
        i.display();
	}

	@Override
	public void subtract() {
		int c = b - a;
		System.out.println("The Subtraction Number is : "+c);
	}

	@Override
	public void addition() {
		int c = a + b ;
		System.out.println("The Addition Value is :"+c);
		
	}
	@Override
	public void display() {
		System.out.println("override the abstract Method");
	}
	
}
