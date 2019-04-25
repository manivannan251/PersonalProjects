package inner_class.static_nested_classes;

public class StaticNestedClassDemo {

	static class Nested {
		public void m1() {
			System.out.println("Nested class method");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested n = new Nested();
		n.m1();

	}

}
