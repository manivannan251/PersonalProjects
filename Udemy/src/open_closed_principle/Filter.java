package open_closed_principle;

import java.util.List;

public interface Filter<T> {
	
	List<T> filter(List<T> items,Specification<T> spec);
}
