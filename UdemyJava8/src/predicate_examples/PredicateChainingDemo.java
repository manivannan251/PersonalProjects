package predicate_examples;

import java.util.function.Predicate;

public class PredicateChainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> greterThanTen = i->i>10;
		int[] val = {66,5,98,23,3,8,2};
		System.out.println("Numbers greater than ten");
		filterAndPrint(greterThanTen, val);
		Predicate<Integer> even = i->i%2==0;
		System.out.println("Numbers which are even");
		filterAndPrint(even, val);
		System.out.println("Numbers which are less than ten");
		filterAndPrint(greterThanTen.negate(), val);
		System.out.println("Numbers which are greater than ten and even");
		filterAndPrint(greterThanTen.and(even), val);
		System.out.println("Numbers which are greater than ten or even");
		filterAndPrint(greterThanTen.or(even), val);

	}
	
	
	public static void filterAndPrint(Predicate<Integer> p,int[] ar) {
		
		for(int a:ar) {
			if(p.test(a))
				System.out.println(a);
		}
	}

}
