package oop_principles;

public class Test1 {
	
	public void m1(Object o)
	{
		System.out.println("Object method is called");
	}
	
	public void m1(String s) {
		System.out.println("String method is called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		t1.m1(null);
	}

}
