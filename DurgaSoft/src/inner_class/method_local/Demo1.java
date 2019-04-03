package inner_class.method_local;

public class Demo1 {
	
	public void m1() {
		class Inner {
			public void m2(int x,int y) {
				System.out.println("The sum is "+(x+y));
			}
		}
		Inner i = new Inner();
		i.m2(10,30);
		;;;;;;;;;
		i.m2(40,50);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 dem = new Demo1();
		dem.m1();

	}

}
