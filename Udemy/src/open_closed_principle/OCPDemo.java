package open_closed_principle;

import java.util.ArrayList;
import java.util.List;

public class OCPDemo {

	public static void main(String[] args) {
		Product apple = new Product("apple", Color.RED, Size.SMALL);
		Product tree = new Product("tree", Color.GREEN, Size.LARGE);
		Product house = new Product("house", Color.BLUE, Size.HUGE);
		List<Product> products = new ArrayList<Product>();
		products.add(apple);products.add(tree);products.add(house);
		ProductFilter pf = new ProductFilter();
		System.out.println("Green products Old");
		pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println("-"+p.getName()+" is green"));
		
		// Based on Specification pattern
		BetterFilter bf = new BetterFilter();
		System.out.println("Green products New");
		bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(p -> System.out.println("-"+p.getName()+" is green"));
		
		System.out.println("Small products New");
		bf.filter(products, new SizeSpecification(Size.SMALL)).forEach(p -> System.out.println("-"+p.getName()+" is small"));

	}

}
