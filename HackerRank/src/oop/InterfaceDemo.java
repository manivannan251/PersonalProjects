package oop;

import java.util.Scanner;
interface AdvancedArithmetic{
	  int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		int count =1;
		for(int i=2;i<=n;i++) {
			if(n%i==0)
				count = count +i;
		}
		return count;
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	

	}
	
	static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    
	}
}
