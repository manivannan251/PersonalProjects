package section2;

public class LoopTaskA implements Runnable {

	private static int count=0;
	
	private int id;
	
	public LoopTaskA() {
		this.id = ++count;
	}

	@Override
	public void run() {
		
		System.out.println("########  <TASK - "+id+" > STARTING ######");
		for(int i=10;i>0;i--) {
			
			System.out.println("<"+id+"> TIK TIK "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("########  <TASK - "+id+" > COMPLETED ######");
	}

}
