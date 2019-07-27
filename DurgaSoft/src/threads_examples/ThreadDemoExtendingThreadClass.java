package threads_examples;

public class ThreadDemoExtendingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExtendingThreadClass t = new ThreadExtendingThreadClass();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
class ThreadExtendingThreadClass extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}
