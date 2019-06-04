package generics;
class GenericType<T> {
	private T t;
	
	public void set(T t1) {
		this.t = t1;
	}
	
	public T getOb() {
		return this.t;
	}
}
public class GenericMethodDemo5 {

	public static <T> boolean isEqual(GenericType<T> g1, GenericType<T> g2) {
		return g1.getOb().equals(g2.getOb());
	}
	
	
	public static <F extends Object> void isEqual2(GenericType<?> g1, GenericType<F> g2) {
		System.out.println("Correct implementation");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericType<String> g1 = new GenericType<>();
		g1.set("Mani");
		
		GenericType<String> g2 = new GenericType<>();
		g2.set("Mani");
		
		GenericType<Integer> g3 = new GenericType<>();
		g3.set(10);
		
		boolean isEq = GenericMethodDemo5.<String>isEqual(g1, g2);
		
		GenericMethodDemo5.isEqual2(g3, g1);
		System.out.println(isEq);
		

	}

}
