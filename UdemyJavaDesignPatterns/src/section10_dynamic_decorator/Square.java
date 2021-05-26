package section10_dynamic_decorator;

public class Square implements Shape {
	
	private int side;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Square(int side) {
		this.side = side;
	}
	
	
	@Override
	public String info() {
		return "A square of side "+ side;
	}

}
