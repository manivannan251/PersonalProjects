package threads_examples;

public class VolatileDemo2 {
	
	private static int MY_INT = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChangeListener().start();
        new ChangeMaker().start();

	}
	
	static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){
                    System.out.println("Got Change for MY_INT : " +MY_INT);
                     local_value= MY_INT;
                     System.out.println("Local Value : " +local_value);
                }
            }
        }
    }
	
	static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
            	MY_INT = ++local_value;
            	System.out.println("Incrementing MY_INT to "+ local_value);
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }

}
