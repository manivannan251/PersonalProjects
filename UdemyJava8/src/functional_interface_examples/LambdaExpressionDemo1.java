package functional_interface_examples;
@FunctionalInterface
interface Interf {
	public void m1();
}
class WithoutLambda implements Interf {

	@Override
	public void m1() {
		System.out.println("m1() method implementation");
		
	}
	
}
public class LambdaExpressionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interf i1 = new WithoutLambda();
		i1.m1();
		Interf i2 = () -> System.out.println("Lambda Method implementation");
		i2.m1();

	}

}
