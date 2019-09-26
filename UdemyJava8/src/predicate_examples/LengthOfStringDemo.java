package predicate_examples;

import java.util.function.Predicate;

public class LengthOfStringDemo {

	public static void main(String[] args) {
		Predicate<String> lengthOfString = s->s.length()>3;
		System.out.println(lengthOfString.test("abcdefty"));
		System.out.println(lengthOfString.test("ab"));
	}

}
