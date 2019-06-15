package singleton;
class EagerSingleton {
	
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
public class EagerSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EagerSingleton si = EagerSingleton.getInstance();
		System.out.println(si);
		EagerSingleton si2 = EagerSingleton.getInstance();
		System.out.println(si2);
		System.out.println(si==si2);
		Runtime.getRuntime();

	}

}
