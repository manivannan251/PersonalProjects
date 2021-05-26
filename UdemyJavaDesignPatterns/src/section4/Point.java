package section4;

public class Point {
	
	private double x,y;
	
	private Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}



	public static class Factory {
		
		public static Point getCartersianPoint(double x, double y) {
			return new Point(x,y);
		}
		
		
		public static Point getPolarPoint(double x, double y) {
			return new Point(x * Math.sin(y),x * Math.cos(y));
		}
	}
}
