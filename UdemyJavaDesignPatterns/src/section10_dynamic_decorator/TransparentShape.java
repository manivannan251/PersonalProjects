package section10_dynamic_decorator;

public class TransparentShape implements Shape {
	
	private Shape shape;
	
	private int transparent;
	
	public TransparentShape() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TransparentShape(Shape shape, int transparent) {		
		this.shape = shape;
		this.transparent = transparent;
	}



	@Override
	public String info() {
		return shape.info() + " and has a transparency of "+ transparent +" percent";
	}

}
