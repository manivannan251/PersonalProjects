package anonymous_inner_class_examples;
interface Intf{
	public void m1();
}
public class LEVariableAssigmentDemo {

	int x=100;
	
	public void m2() {
		int z=999;
		Intf i1 = ()-> {
			int y=500;
			System.out.println("The local variable "+y);
			System.out.println("The instance variable "+this.x);
			System.out.println("The method local variale "+z);
			x=500;
			//z=777;
		};
		i1.m1();
	}
	
	public int getX() {
		return x;
	}

	public static void main(String[] args) {
		LEVariableAssigmentDemo le = new LEVariableAssigmentDemo();
		le.m2();
		System.out.println("The value after reassignment "+le.getX());
	}

}
