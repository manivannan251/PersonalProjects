package open_closed_principle;

import java.util.ArrayList;
import java.util.List;

public class BetterFilter implements Filter<Product>{

	@Override
	public List<Product> filter(List<Product> items, Specification<Product> spec) {
		List<Product>temp = new ArrayList<Product>();
		for(Product item: items) {
			if(spec.isSatisfied(item))
				temp.add(item);
		}
		return temp;
	}
	

}
