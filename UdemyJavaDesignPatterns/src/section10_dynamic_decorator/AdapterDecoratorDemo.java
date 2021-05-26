package section10_dynamic_decorator;

public class AdapterDecoratorDemo {

	public static void main(String[] args) {
		
		MyStringBuilder msb = new MyStringBuilder();
		msb.append("Hello");
		msb.appendLine("World");
		msb.concat("Hi");
		System.out.println(msb.concat("Hi"));

	}

}
