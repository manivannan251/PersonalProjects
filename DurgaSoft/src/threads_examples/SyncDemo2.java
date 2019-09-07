package threads_examples;
class DisplayNumChar {
	
	public synchronized void displayNumber() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}			
	}
	
	public synchronized void displayChar() {
		for(int i=65;i<75;i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class DisplayNumberThread extends Thread {
	
	DisplayNumChar dp;
	
	public DisplayNumberThread(DisplayNumChar dn) {
		// TODO Auto-generated constructor stub
		this.dp = dn;
	}
	
	public void run() {
		dp.displayNumber();
	}
}
class DisplayCharThread extends Thread {
	
	DisplayNumChar dp;
	
	public DisplayCharThread(DisplayNumChar dn) {
		// TODO Auto-generated constructor stub
		this.dp = dn;
	}
	
	public void run() {
		dp.displayChar();
	}
}
public class SyncDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubDisplay
		DisplayNumChar dnc = new DisplayNumChar();
		DisplayNumberThread dnt = new DisplayNumberThread(dnc);
		dnt.start();
		DisplayCharThread dct = new DisplayCharThread(dnc);
		dct.start();
	}

}
