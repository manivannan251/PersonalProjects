package section2;

public class CreatingThreadsFifthWay {

	public static void main(String[] args) {
		System.out.println("Main thread starts here !!");
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("########  <TASK -  > STARTING ######");
				for(int i=10;i>0;i--) {
					
					System.out.println("<"+i+"> TIK TIK "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		t.start();
		
		System.out.println("Main thread ends here !!");

	}

}
