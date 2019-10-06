package predicate_examples_primitive;

import java.util.function.IntPredicate;

public class PrimitivePredicateDemo {

	public static void main(String[] args) {
		
		int[] num = {44,33,22,66,11,12,23,34,56,23,99,767,341};
		IntPredicate even = i->i%2==0;
		for(int n:num) {
			if(even.test(n))
				System.out.println("The even numbers are "+n);
		}

	}

}
