package collection_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemoUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("Goku");
		l.add("Gohan");
		l.add("Bulma");
		l.add("piccolo");
		l.add("trunks");
		l.add("Android18");
		System.out.println("Values before sorting "+l);
		Comparator<String> desc = (s1,s2) -> s1.compareTo(s2)<1?+1:s2.compareTo(s1)<1?-1:0;
		Collections.sort(l, desc);
		System.out.println("Values after sorting "+l);
		

	}

}
