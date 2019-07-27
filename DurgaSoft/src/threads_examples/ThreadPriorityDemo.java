package threads_examples;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread priority of main thread "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Thread priority after changing "+Thread.currentThread().getPriority());
		
	}

}
