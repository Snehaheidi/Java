package accessmodifier;

public class ClassA {
	private int a;  // only private field is declare outside the method or , block , or constructor
	public int c = 50;
	protected String name = "sneha";
	int age = 21;
	public static void main(String[] args) {
		ClassA.display();  // static method is called class name  jvm create the memory
		//ClassA.view()  --> non-static method throw error bcz cannot call class object
		ClassA a = new ClassA();
		a.view(); // now we call non-static method
	}
	private static void display() {
	    int b = 20; // private value cannot access outside the method   &  private int b=20;--> error throe
		System.out.println("static method");
	}
	public void view() {
		//b = 30;  --> cannot access the value in private method
		a = 5;
		System.out.println("non-static method");
	}

}
