package functional_interface_examples;

public class LamdbaExpessionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf intf = () -> System.out.println("m1 method implementation");
		intf.m1();
		

	}

}
