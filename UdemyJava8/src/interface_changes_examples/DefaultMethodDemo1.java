package interface_changes_examples;
interface Interf{
	default void m1() {
		System.out.println("Inside interface default method");
	}
}
public class DefaultMethodDemo1 implements Interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodDemo1 dmd = new DefaultMethodDemo1();
		dmd.m1();

	}

}
