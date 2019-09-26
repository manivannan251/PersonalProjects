package predicate_examples;

import java.util.function.Predicate;

public class StartsWithK {

	public static void main(String[] args) {
		String[] users = {"Mani","kajal","krillin","Bulma"};
		Predicate<String> startsWithK = s->s.startsWith("k");
		for(String user:users) {
			if(startsWithK.test(user)) {
				System.out.println(user);
			}
				
		}

	}

}
