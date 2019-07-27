package threads_examples;
class InterruptThread extends Thread {
	
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("I am a lazy thread");
		}
		System.out.println("I am going to sleep");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("I got interrupted");
		}
	}
}
public class ThreadInterruptExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		InterruptThread it = new InterruptThread();
		it.start();
		Thread.sleep(2000);
		System.out.println("Going to call interrupt method");
		
		it.interrupt();
		System.out.println("Called Interrupted method");

	}

}
