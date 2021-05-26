package oops;

public class OverloadedMethods1 {
	
	
	private void methodOne(float i) {
		System.out.println("Int args method");
	}
	
	private void methodOne(int i) {
		System.out.println("Int args method");
	}
	
	
	
	public static void main(String[] args) {
		OverloadedMethods1 ov = new OverloadedMethods1();
		float a = 3.6f;
		ov.methodOne('a');
		ov.methodOne(101);
		ov.methodOne(a);

	}

}
