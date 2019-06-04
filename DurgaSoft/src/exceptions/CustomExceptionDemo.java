package exceptions;
class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("this is for checked exception");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
