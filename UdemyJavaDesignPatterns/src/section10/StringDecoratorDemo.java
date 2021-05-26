package section10;

public class StringDecoratorDemo {

	public static void main(String[] args) {
		
		StringDecorator sd = new StringDecorator("hello");
		System.out.println(sd + " has "+ sd.getVovels()+ " vowels");

	}

}
