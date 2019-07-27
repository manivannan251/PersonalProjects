package threads_examples;
class ThreadJoin extends Thread {
	static Thread mt;
	
	public void run() {
		//mt.join();
		for(int i=0;i<10;i++) {
			if(i==6) {
				try {
					mt.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Child Thread "+i);
			
		}
	}
}
public class ThreadJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoin tj = new ThreadJoin();
		ThreadJoin.mt = Thread.currentThread();
		tj.start();
		for(int i=0;i<100;i++) {
			System.out.println("Main Thread "+i);			
		}

	}

}
