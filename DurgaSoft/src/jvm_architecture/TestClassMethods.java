package jvm_architecture;
import java.lang.reflect.*;
class Student {
	
	public String getName() {
		return null;
	}
	
	public int getMarks() {
		return 10;
	}
}
public class TestClassMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		//Class c = Class.forName("jvm_architecture.Student");
		Class c = Class.forName("java.lang.String");
		int count = 0;
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m) {
			System.out.println(m1);
			count+=1;
		}
		System.out.println("The total number of methods present are "+count);

	}

}
