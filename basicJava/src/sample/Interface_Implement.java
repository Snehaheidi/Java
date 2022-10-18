package sample;

public class Interface_Implement implements Addition , Subtraction{

	public static void main(String[] args) {
		int a = 10 , b = 5;
//		int result = add_inter(a,b);
		Interface_Implement i = new Interface_Implement();  
		System.out.println("Addition = "+i.add_inter(a,b));
		System.out.println("Subtraction = "+i.sub_inter(a,b));
		i.display(); // Default method in interface class
//		i.view();   --> Private method 
		Addition.Result(); // without object called class name --> Static method
		Result(); // object create pannama static method called
	}
	@Override
	public int sub_inter(int a, int b) {
		int c = a - b;
		return c;
	}

	@Override
	public int add_inter(int a , int b) {
		int c = a+b;
		return c;
	}
/*	default void display() {
		//Interface default method cann't be override 
	}*/
	public static void Result() {
		System.out.println("Main Class --> Method ");
	}
}
