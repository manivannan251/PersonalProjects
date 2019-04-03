package inner_class.method_local;

public class Demo2 {
	
	int x=10;
	static int y=20;
	public static void m1() {
		class Inner {
			public void m2() {
				//System.out.println(x);
				System.out.println(y);
			}
		}
		;;;;;
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 dem = new Demo2();
		dem.m1();

	}

}
