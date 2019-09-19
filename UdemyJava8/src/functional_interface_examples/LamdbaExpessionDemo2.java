package functional_interface_examples;
interface intf2 {
	public void m2(int a,int b);
}
public class LamdbaExpessionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intf2 intf = (a,b) -> System.out.println("The sum is "+(a+b));
		intf.m2(5,7);
		intf.m2(77, 88);
		

	}

}
