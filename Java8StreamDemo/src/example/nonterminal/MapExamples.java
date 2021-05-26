package example.nonterminal;

import java.util.Arrays;
import java.util.List;

public class MapExamples {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mani",
				"How are you doing",
				"When will you be coming");
		
		names.stream().map(s->s.toUpperCase()).forEach(System.out::println);

	}

}
