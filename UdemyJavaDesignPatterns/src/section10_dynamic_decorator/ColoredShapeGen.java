package section10_dynamic_decorator;

import java.util.function.Supplier;

public class ColoredShapeGen<T extends Shape>  implements Shape {
	
	private String color;
	
	private Shape shape;
	
	public ColoredShapeGen(Supplier<? extends T> ctr,String color) {
		shape = ctr.get();
		this.color = color;
	}
	
	@Override
	public String info() {
		return shape.info()+" with color "+color;
	}

}
