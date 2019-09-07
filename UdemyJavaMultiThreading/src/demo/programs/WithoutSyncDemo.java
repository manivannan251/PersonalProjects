package demo.programs;

public class WithoutSyncDemo {
	
	private int counter = 0;
	
	private void increment() {
		counter++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutSyncDemo ws = new WithoutSyncDemo();
		ws.doWork();
	}
	
	private void doWork() {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<100;i++)
					increment();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<100;i++)
					increment();
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("The counter value is "+counter);
		
	}

}
