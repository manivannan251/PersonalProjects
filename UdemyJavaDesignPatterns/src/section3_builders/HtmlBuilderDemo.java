package section3_builders;

public class HtmlBuilderDemo {

	public static void main(String[] args) {
		/*
		 * HtmlBuilder builder = new HtmlBuilder("ul"); builder.addChild("li", "Hello");
		 * builder.addChild("li", "World");
		 */
		
		
		//Code for fluent builder
		HtmlBuilder builder = new HtmlBuilder("ul");
		builder.addChild("li", "Hello").
		addChild("li", "World");
		System.out.println(builder);
	}

}
