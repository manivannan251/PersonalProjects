package section3_builders;

public class HtmlBuilder {
	
	private String rootName;
	
	private HtmlElement root = new HtmlElement();
	
	public HtmlBuilder(String name) {
		this.rootName = name;
		root.name = name;
	}
	
	/*
	 * public void addChild(String name,String text) { HtmlElement e = new
	 * HtmlElement(name, text); root.elements.add(e); }
	 */
	
	public HtmlBuilder addChild(String name,String text) {
		HtmlElement e = new HtmlElement(name, text);
		root.elements.add(e);
		return this;
	}
	
	public void clear() {
		root = new HtmlElement();
		root.name = rootName;
	}

	@Override
	public String toString() {
		return root.toString();
	}
	
	
}


