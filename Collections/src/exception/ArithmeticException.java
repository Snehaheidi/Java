package exception;

public class ArithmeticException {

	public static void main(String[] args) {
		ArithmeticException a = new ArithmeticException();
		a.except();

	}
    public void except() {
    	int a = 10 , b = 0;
    	try {
    		int c = a/b;
    		System.out.println(c);
    	}
    	catch(Exception e) {
    		e.printStackTrace();  // LIFO --> line by line error handle 
    		System.out.println("/by zero");
    	}
    }
}
