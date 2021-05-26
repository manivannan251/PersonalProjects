package example.nonterminal.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithoutFlatMapDemo {

	public static void main(String[] args) {
		String[][] array = new String[][] {{"a","b"},{"c","d"},{"e","f"}};
		
		Stream<String[]> stream1 = Arrays.stream(array);
		
		List<String[]> result = stream1.filter(x->!x.equals("a")).collect(Collectors.toList());
		
		System.out.println(result.size());    // 0

		result.forEach(System.out::println); 

	}

}
