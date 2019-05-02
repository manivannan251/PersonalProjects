package generics;
class Gen<T> {
	T obj;
	public Gen(T ob) {
		this.obj = ob;
	}
	public void show() {
		System.out.println("The type is "+obj.getClass().getName());
	}
	
	public T getOb() {
		return obj;
	}
}

public class GenericsDemo1 {

	public static void main(String[] args) {
		
		Gen<String> g1 = new Gen<String>("Mani");
		g1.show();
		System.out.println(g1.getOb());
		

		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getOb());
		
		Gen<Double> g3 = new Gen<Double>(10.5);
		g3.show();
		System.out.println(g3.getOb());

	}

}
