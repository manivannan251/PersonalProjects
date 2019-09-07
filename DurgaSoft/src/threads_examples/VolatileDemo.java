package threads_examples;
class Counter {
	public static int counter = 100;	
	
	
}
class Runner extends Thread {
	
	public void run() {
			int temp = Counter.counter;
			while(temp<105) {
				System.out.println(Thread.currentThread().getName()+" : I am running on value "+temp);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				temp++;
			}
			Counter.counter = temp;
	}
	
	
}
class Runner2 extends Thread {
	
	public void run() {
		//int temp = Counter.counter;
		while(Counter.counter<104) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ " I am still running");
			//temp = Counter.counter;
		}
	}
}
public class VolatileDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		Runner r= new Runner();
		
		Runner2 r2 = new Runner2();
		r2.start();
		r.start();
		//Thread.sleep(10000);
		//System.out.println("Going to reset counter");
		//r.setCounter(5);
		//Runner r2 = new Runner(c);
		
		//c2.counter=500;

	}

}
