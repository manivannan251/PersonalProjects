package functional_interface_examples;

public class LambdaExpressionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> {
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
