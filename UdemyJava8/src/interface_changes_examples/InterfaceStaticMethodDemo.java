package interface_changes_examples;
interface sum {
	static void sum(int a,int b) {
		System.out.println("The sum is "+(a+b));
	}
}
public class InterfaceStaticMethodDemo implements sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceStaticMethodDemo ism = new InterfaceStaticMethodDemo();
		//ism.sum(10,20);
		sum.sum(10, 20);

	}

}
