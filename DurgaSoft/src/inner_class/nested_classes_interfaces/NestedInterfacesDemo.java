package inner_class.nested_classes_interfaces;
interface Outer {
	public void m1();
	interface Inner{
		public void m2();
	}
}
class Test1 implements Outer {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Outer interface m1 method");
		
	}
	
}
class Test2 implements Outer.Inner {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Inner interface m2 method");
	}
	
}
public class NestedInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		t1.m1();
		Test2 t2 = new Test2();
		t2.m2();

	}

}
