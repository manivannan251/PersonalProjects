package functional_interface_examples;
@FunctionalInterface
interface Intf3 {
	
	public int getLength(String s);
}
interface Intf4 extends Intf3{
	
	public int m2();
}
public class LambdaExpressionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf3 intf = s -> s.length();
		System.out.println(intf.getLength("Happy Boy"));

	}

}
