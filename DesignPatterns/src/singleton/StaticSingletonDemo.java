package singleton;

import javax.management.RuntimeErrorException;

class StaticSingleton{
	
	private static StaticSingleton instance;
	
	private StaticSingleton() {}
	
	static {
		try {
			instance = new StaticSingleton();
		}catch(Exception e) {
			throw new RuntimeErrorException(null, "Exception occurred in creating singleton instance");
		}
	}
	
	public static StaticSingleton getInstance() {
		return instance;
	}
}
public class StaticSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSingleton si = StaticSingleton.getInstance();
		System.out.println(si);
		StaticSingleton si2 = StaticSingleton.getInstance();
		System.out.println(si2);
		System.out.println(si==si2);

	}

}
