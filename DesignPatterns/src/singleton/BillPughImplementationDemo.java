package singleton;
class BillPughImplementation {
	private BillPughImplementation() {}
	
	private static class SingletonHelper {
		private static final BillPughImplementation INSTANCE = new BillPughImplementation();
		
	}
	
	public static BillPughImplementation getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
public class BillPughImplementationDemo {

	public static void main(String[] args) {
		BillPughImplementation si = BillPughImplementation.getInstance();
		System.out.println("The hashcode of first instance is "+si.hashCode());
		BillPughImplementation si2 = BillPughImplementation.getInstance();
		System.out.println(si2.hashCode());
		System.out.println(si==si2);

	}

}
