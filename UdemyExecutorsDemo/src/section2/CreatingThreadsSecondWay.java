package section2;

import java.util.concurrent.TimeUnit;

public class CreatingThreadsSecondWay {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		new SecondTask().start();
		System.out.println("Main thread ends here");
		Thread t2 = new SecondTask();
		t2.start();

	}

}

class SecondTask extends Thread {
	
	private static int count = 0;
	
	private int id;
	
	public SecondTask() {		
		this.id = ++count;
	}
	
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("<"+id+">"+"Tick Tock "+i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}