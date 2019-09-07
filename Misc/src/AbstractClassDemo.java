abstract class Calc {
	
	public void add() {
		System.out.println("The add method is called");
	}
	
	//public abstract void sub();
}
public class AbstractClassDemo extends Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calc cl = new AbstractClassDemo();
		Calc cl = new Calc() {};
		cl.add();

	}

	/*@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("The subtract method is called");
		
	}
	
	*/

}
