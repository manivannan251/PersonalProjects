package section3;
class Processor {
	
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("inside produce method");
			wait();
			System.out.println("Again inside produce method");
		}
	}
	
	public void consume() throws InterruptedException {
		//Thread.sleep(1000);
		synchronized (this) {
			System.out.println("Inside consume method");
			notify();
			Thread.sleep(3000);
		}
	}
}
public class WaitAndNotifyDemo {

	public static void main(String[] args) {
		
		final Processor p = new Processor();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					p.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					p.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		//t1.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
