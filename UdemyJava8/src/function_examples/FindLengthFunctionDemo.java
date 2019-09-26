package function_examples;

import java.util.Scanner;
import java.util.function.Function;

public class FindLengthFunctionDemo {

	public static void main(String[] args) {
		Function<String,Integer> findLength = s->s.length();
		System.out.println("Enter a string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("The length of given string is "+findLength.apply(str));

	}

}
