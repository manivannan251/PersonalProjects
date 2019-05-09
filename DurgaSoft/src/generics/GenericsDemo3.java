package generics;

import java.util.ArrayList;

public class GenericsDemo3 {

	@SuppressWarnings("unchecked")
	public static void m1(ArrayList l) {
		l.add(10);
		l.add(10.5);
		l.add(true);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<>();
		l.add("Mani");
		l.add("Vann");
		//l.add(10.6);
		//l.add(true);
		m1(l);
		System.out.println(l);

	}

}
