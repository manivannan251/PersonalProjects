package consumer_examples;
interface Consumer<T> {
	
	public void accept(T t);
}
public class ConsumerDemo1 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello");
		c.accept("World");

	}

}
