package example.nonterminal;

import java.util.Arrays;
import java.util.List;

public class FilterExamples {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mani",
				"How are you doing",
				"When will you be coming");
		
		System.out.println("The list having size more than 10 is "+names.stream().filter(s->s.length()>10).count());

	}

}
