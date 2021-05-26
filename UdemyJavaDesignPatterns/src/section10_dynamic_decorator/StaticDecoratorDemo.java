package section10_dynamic_decorator;

public class StaticDecoratorDemo {

	public static void main(String[] args) {
		ColoredShapeGen<Square> cs = new ColoredShapeGen<Square>(() -> new Square(10), "green");
		System.out.println(cs.info());
	}

}
