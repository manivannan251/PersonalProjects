package inner_class;

public class OuterClassDemo {
	
	class Inner {
		
		public void m1() {
			System.out.println("Inside inner class m1 method");
		}
	}
	public static void main(String[] args) {
		OuterClassDemo o = new OuterClassDemo();
		OuterClassDemo.Inner i = o.new Inner();

	}

}
