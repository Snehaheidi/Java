package thread;

public class ThreadChild extends Thread{
	@Override
	public void run() {
		synchronized(this) {
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
}