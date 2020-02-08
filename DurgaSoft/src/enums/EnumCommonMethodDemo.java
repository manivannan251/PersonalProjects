package enums;

import java.util.InputMismatchException;

enum Color {
	BLUE,RED,GREEN;
	public void info()  {
		System.out.println("Dangerous color");
		throw new InputMismatchException("hello");
	}
}
public class EnumCommonMethodDemo {

	public static void main(String[] args) {
		Color[] color = Color.values();
		for(Color c1:color) {
			c1.info();
		}
		
		
		int a=2;
		if((Integer)a==null)
			throw new NullPointerException();
	}

}
