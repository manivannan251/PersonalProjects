package inner_class;

public class OuterClassDemo3 {
	int x=10;
	class Inner {
		int x=100;
		public void m1() {
			int x=1000;
			System.out.println("The value of x inside m1 is "+x);
			System.out.println("The value of x inside Inner class is "+this.x);
			System.out.println("The value of x inside OuterClass is "+OuterClassDemo3.this.x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OuterClassDemo3().new Inner().m1();
	}

}
