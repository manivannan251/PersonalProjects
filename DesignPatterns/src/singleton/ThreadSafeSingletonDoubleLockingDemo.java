package singleton;
class ThreadSafeSingletonDoubleLocking {
	private static ThreadSafeSingletonDoubleLocking instance;
	
	private ThreadSafeSingletonDoubleLocking() {}
	
	public static ThreadSafeSingletonDoubleLocking getInstance() {
		if(instance==null) {
			synchronized (ThreadSafeSingletonDoubleLocking.class) {
				if(instance==null) {
					System.out.println("There is no instance a new instance is going to be created");
					instance = new ThreadSafeSingletonDoubleLocking();
				}
			}
			
		}
		else {
			System.out.println("There is already a instance");
		}
		return instance;
	}
}
public class ThreadSafeSingletonDoubleLockingDemo {

	public static void main(String[] args) {
		
		ThreadSafeSingletonDoubleLocking si = ThreadSafeSingletonDoubleLocking.getInstance();
		System.out.println(si.hashCode());
		ThreadSafeSingletonDoubleLocking si2 = ThreadSafeSingletonDoubleLocking.getInstance();
		System.out.println(si2.hashCode());
		System.out.println(si==si2);

	}

}
