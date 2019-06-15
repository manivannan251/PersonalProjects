package singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getinstance() {
		if(instance==null) {
			System.out.println("There is no instance a new instance is going to be created");
			instance = new ThreadSafeSingleton();
		}
		else {
			System.out.println("There is already a instance");
		}
		return instance;
 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafeSingleton si = ThreadSafeSingleton.getinstance();
		System.out.println(si.hashCode());
		ThreadSafeSingleton si2 = ThreadSafeSingleton.getinstance();
		System.out.println(si2.hashCode());
		System.out.println(si==si2);

	}

}
