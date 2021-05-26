package section10_dynamic_decorator;

public class ColoredShape implements Shape {
	
	private Shape shape;
	
	private String color;
	
	public ColoredShape() {
		// TODO Auto-generated constructor stub
	}
	
	public ColoredShape(Shape shape,String color) {
		this.shape = shape;
		this.color = color;
	}
	
	@Override
	public String info() {
		return shape.info()+" and has a color of "+color;
	}

}
