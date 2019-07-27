package threads_examples;
class ThreadImplRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread "+i);
		}
		
	}
	
}
public class ThreadDemoImplentingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadImplRunnable r = new ThreadImplRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("Main Thread "+i);

	}

}
