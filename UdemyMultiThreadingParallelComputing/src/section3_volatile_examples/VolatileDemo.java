package section3_volatile_examples;
class Status {
	
	private boolean status = false;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean stat) {
		status = stat;
	}
}
class VolatileRunner implements Runnable {
	
	Status st;
	
	
	public VolatileRunner(Status st) {
		this.st = st;
	}


	public void run() {
		int i=0;		
		boolean local = st.isStatus();
		while(!local) {
			System.out.println("Iterating :"+i);
			i++;
			local = st.isStatus();
		}
	}
} 
public class VolatileDemo {

	public static void main(String[] args) throws InterruptedException {
		Status st = new Status();
		VolatileRunner vr = new VolatileRunner(st);
		Thread th = new Thread(vr);
		th.start();
		Thread.sleep(3000);
		System.out.println("Returned from sleep");
		st.setStatus(true);
		th.join();
	}

}
