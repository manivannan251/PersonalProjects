package open_closed_principle;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter {
	
	public List<Product> filterByColor(List<Product> products, Color color) {
		List<Product> templist  = new ArrayList<>();
		for(Product tempProduct : products) {
			if(tempProduct.getColor()==color)
				templist.add(tempProduct);
		}
		return templist;
	}
	
	public List<Product> filterBySize(List<Product> products,Size size) {
		List<Product> templist  = new ArrayList<>();
		for(Product tempProduct : products) {
			if(tempProduct.getSize()==size)
				templist.add(tempProduct);
		}
		return templist;
	}
	
	public List<Product> filterBySizeAndColor(List<Product> products,Size size,Color color) {
		List<Product> templist  = new ArrayList<>();
		for(Product tempProduct : products) {
			if(tempProduct.getSize()==size&&tempProduct.getColor()==color)
				templist.add(tempProduct);
		}
		return templist;
	}
}
