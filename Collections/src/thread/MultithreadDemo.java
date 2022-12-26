package thread;

//Parent Class 
public class MultithreadDemo {
	public static void main(String[] args) {
	    ThreadChild t = new ThreadChild();
	    t.start();  //concurrent ah main for loop & child for loop run aagum
	   //t.run();    //run method complete agitu main for loop run aagum
//	    for(int i=0;i<5;i++) {
//	    	System.out.println("Main Thread ");
//	    }    
	    RunnableThread r = new RunnableThread();
	    Thread t1 = new Thread(r);
	    t1.start();
	}
//	 synchronized void display() {
//		 
//	 }
}
