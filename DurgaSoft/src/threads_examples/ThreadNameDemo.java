package threads_examples;
class ThreadName extends Thread {
	
}
public class ThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		ThreadName t= new ThreadName();
		ThreadName t2= new ThreadName();
		System.out.println(t.getName());
		System.out.println(t2.getName());
		System.out.println("After setting new names");
		Thread.currentThread().setName("Baahu");
		t.setName("Balla");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());

	}

}
