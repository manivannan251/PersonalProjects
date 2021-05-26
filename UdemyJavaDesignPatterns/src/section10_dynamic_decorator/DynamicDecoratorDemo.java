package section10_dynamic_decorator;

public class DynamicDecoratorDemo {

	public static void main(String[] args) {
		
		Shape cic = new TransparentShape(new ColoredShape(new Square(10),"green"),50);
		System.out.println(cic.info());

	}

}
