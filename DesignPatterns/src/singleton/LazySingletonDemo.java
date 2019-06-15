package singleton;
class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton() {}
	
	public static LazySingleton getinstance() {
		if(instance==null) {
			System.out.println("There is no instance a new instance is going to be created");
			instance = new LazySingleton();
		}
		else {
			System.out.println("There is already a instance");
		}
		return instance;
 	}
}
public class LazySingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingleton si = LazySingleton.getinstance();
		System.out.println(si.hashCode());
		LazySingleton si2 = LazySingleton.getinstance();
		System.out.println(si2.hashCode());
		System.out.println(si==si2);


	}

}
