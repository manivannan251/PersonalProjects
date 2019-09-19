package collection_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo {

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
		Collections.sort(l, new DescendingComparator());
		System.out.println("Values after sorting "+l);

	}

}
