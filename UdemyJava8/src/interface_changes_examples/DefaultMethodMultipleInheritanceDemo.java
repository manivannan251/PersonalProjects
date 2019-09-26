package interface_changes_examples;
interface left {
	
	default void dir() {
		System.out.println("Towards left side");
	}
}
interface right {
	default void dir() {
		System.out.println("Towards right side");
	}
}
public class DefaultMethodMultipleInheritanceDemo implements left,right {

	public static void main(String[] args) {
		DefaultMethodMultipleInheritanceDemo dm = new DefaultMethodMultipleInheritanceDemo();
		dm.dir();

	}

	@Override
	public void dir() {		
		System.out.println("overriden method");
		left.super.dir();
		right.super.dir();
	}

}
