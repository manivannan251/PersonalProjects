package section10_dynamic_decorator;

public class Circle implements Shape {
	
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int rad) {
		this.radius = rad;
	}
	@Override
	public String info() {
		return "A circle of radius "+radius;
	}

}
