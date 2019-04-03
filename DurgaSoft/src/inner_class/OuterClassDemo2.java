package inner_class;

public class OuterClassDemo2 {
	
	int x=10;
	static int y=20;
	class Inner {
		public void m1() {
			System.out.println("The value of x is "+x);
			System.out.println("The value of y is "+y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OuterClassDemo2().new Inner().m1();
	}

}
