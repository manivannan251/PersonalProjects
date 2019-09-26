package predicate_examples;

import java.util.function.Predicate;

public class RemoveNullAndEmptyDemo {

	public static void main(String[] args) {
		String[] names = {"Gohan","",null,"Piccolo","Goten",null,""};
		Predicate<String> isNotEmptyAndNull = s->s!=null&&s.length()>0;
		for(String name:names) {
			if(isNotEmptyAndNull.test(name))
				System.out.println(name);
		}

	}

}
