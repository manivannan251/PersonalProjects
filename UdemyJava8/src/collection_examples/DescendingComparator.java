package collection_examples;

import java.util.Comparator;

public class DescendingComparator implements Comparator<String>{

	@Override
	public int compare(String st1, String st2) {		
	
		return st1.compareTo(st2)<1?+1:st2.compareTo(st1)<1?-1:0;
	}

}
