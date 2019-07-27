package threads_examples;
class ThreadSleep extends Thread {
	
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Child Thread "+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadSleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleep ts= new ThreadSleep();
		ts.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			
		}

	}

}
