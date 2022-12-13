package thread;

public class ThreadChild extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi, Welcome ");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
   
}
