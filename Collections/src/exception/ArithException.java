package exception;

public class ArithException {

	public static void main(String[] args) {
		ArithException a = new ArithException();
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
//    	catch(ArithmeticException e) {
//    	
//    		//parent class Exception decalre panitu child Exceptionclass next declare panna thorw error
//    	}
    	finally {
    		System.out.println("always execute finally block");
    	}
    }
}
