package function_examples_primitive;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionalInterfacesDemo {

	public static void main(String[] args) {
		IntFunction<Integer> square = i->i*i;
		System.out.println("The square is "+square.apply(2));
		
		ToIntFunction<String> length = s->s.length();
		System.out.println("The length of the string admin is "+length.applyAsInt("admin"));
		
		IntToDoubleFunction sqrt = i-> Math.sqrt(i);
		System.out.println("The square root is "+sqrt.applyAsDouble(5));

	}

}
