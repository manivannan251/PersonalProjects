package function_examples;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		Function<Integer,Integer> doubleval = i->i*2;
		Function<Integer,Integer> cube = i->i*i*i;
		System.out.println("Double of no followed by cube is "+doubleval.andThen(cube).apply(no));
		System.out.println("Cube followed by double "+doubleval.compose(cube).apply(no));
		

	}

}
