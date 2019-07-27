package threads_examples;
class ThreadYield extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread ");
			//Thread.yield();
		}
	}
}
public class ThreadYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadYield ty = new ThreadYield();
		ty.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.yield();
		}
	}

}
