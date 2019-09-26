package predicate_examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class EmptyCollectionDemo {

	public static void main(String[] args) {
		Predicate<Collection> isEmpty = i->i.isEmpty();
		List<String> test = new ArrayList<String>();
		System.out.println(isEmpty.test(test));
		test.add("mi");
		System.out.println(isEmpty.test(test));

	}

}
