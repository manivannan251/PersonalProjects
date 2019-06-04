package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			
			if (value.equals("3"))
				//myList.remove(value);
				it.remove();
			System.out.println("List Value:" + value);
		}
		System.out.println(myList);

	}

}
