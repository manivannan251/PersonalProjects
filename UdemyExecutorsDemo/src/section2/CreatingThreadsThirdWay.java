package section2;

import java.util.concurrent.TimeUnit;

public class CreatingThreadsThirdWay {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		new ThirdTask();
		System.out.println("Main thread ends here");
		new ThirdTask();

	}

}

class ThirdTask implements Runnable {
	
	private static int count = 0;
	
	private int id;
	
	public ThirdTask() {		
		this.id = ++count;
		new Thread(this).start();;
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