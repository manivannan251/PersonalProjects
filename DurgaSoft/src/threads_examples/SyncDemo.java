package threads_examples;
class Display {
	public void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
class WishThread extends Thread {
	
	Display d;
	
	String name;
	
	public WishThread(Display d,String name) {
		// TODO Auto-generated constructor stub
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		//Display d2 = new Display();
		WishThread wt = new WishThread(d, "Kohli");
		WishThread wt2 = new WishThread(d, "Rohit");
		wt.start();
		wt2.start();

	}

}
