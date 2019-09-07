package test;

public class TesyFile {

	public static void main(String[] args) throws Exception {
		A a = new A();
		a.m1();
		//a.m
		B b = new B();
		b.m1();
		A a1 = new B();
		a1.m1();
		a1.m2();
		//a1.m3();
		System.out.println(b instanceof A);
		//B b1 = (B) new A();
		//b1.m1();
	}

}
