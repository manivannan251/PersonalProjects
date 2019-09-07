
public class TestFactorialWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial of 5 is "+recur(3));

	}
	
	public static int recur(int a) {
		if(a==1)
			return 1;
		else
			return a*recur(a-1);
		
	}

}
