package sample;

public class SuperClass extends ThisClass{
    public static void main(String args[]) {
    	SuperClass s = new SuperClass();
    	s.display(); 
    	dis();
//    	super.ScreenOne();
//    	super.run();
    }
	private void display() {
		this.run();
		super.run();
//    	super.ScreenOne();
	}
	public static void dis() {
		System.out.println("Static method");
	}
	public void run() {
		System.out.println("Super Class run method");
	}
}

