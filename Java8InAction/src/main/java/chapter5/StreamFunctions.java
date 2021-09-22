package chapter5;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFunctions {

	public static void main(String[] args) {
		generateFiboTuples();
		generateFiboSeries();
		generateFiboUsingGenerate();

	}
	
	private static void generateFiboTuples() {
		System.out.println("The fibonacci tuples are :");
		Stream.iterate(new int[] {0,1}, t -> new int[] {t[1],t[0]+t[1]})
		.limit(5)
		.forEach(t->System.out.println("("+t[0]+","+t[1]+")"));
	}
	
	
	private static void generateFiboSeries() {
		System.out.println("The fibonacci series are :");
		Stream.iterate(new int[] {0,1}, t -> new int[] {t[1],t[0]+t[1]})
		.limit(10)
		.map(t->t[0])
		.forEach(System.out::println);
	}
	
	
	private static void generateFiboUsingGenerate() {
		System.out.println("The fibonacci series using generate are :");
		IntSupplier fib = new IntSupplier() {
			
			private int prev = 0;
			private int curr = 1;
			
			@Override
			public int getAsInt() {
				int oldprev = this.prev;
				int nextValue = this.prev + this.curr;
				this.prev = this.curr;
				this.curr = nextValue;
				return oldprev;
			}
		};
		
		IntStream.generate(fib).limit(10).forEach(System.out::println);
	}

}
