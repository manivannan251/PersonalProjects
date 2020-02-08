package section3;

public class SynchronizedBlockDemo {

	private static int counter1 = 0;
	
	private static int counter2 = 0;
	
	private static Object ob1 = new Object();
	
	private static Object ob2 = new Object();
	
	private static void increment1() {
		synchronized (ob1) {
			counter1++;
		}
		
	}
	
	
	private static void increment2() {
		synchronized (ob2) {
		counter2++;
		}
	}
	
	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					increment1();
				}
				
			}
		});
		
        Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					increment2();
				}
				
			}
		});
        long start = System.currentTimeMillis();
        th1.start();
        th2.start();
        try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
        long end = System.currentTimeMillis();
        System.out.println("Counter 1 "+counter1);
        System.out.println("Counter 2 "+counter2);
        System.out.println("Time taken "+(end-start));

	}

}
