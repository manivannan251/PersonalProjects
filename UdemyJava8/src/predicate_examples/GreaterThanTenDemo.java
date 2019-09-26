package predicate_examples;

import java.util.Scanner;
import java.util.function.Predicate;

public class GreaterThanTenDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> greaterThan10 = i->i>10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer");
		int num = sc.nextInt();
		if(greaterThan10.test(num))
			System.out.println("The number is greater than ten");
		else
			System.out.println("The number is less than ten");

	}

}
