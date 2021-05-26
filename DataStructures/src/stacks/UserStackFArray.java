package stacks;

public class UserStackFArray<T> {
	
	private static int capacity = 10;
	
	private T[] sRep;
	
	private int top = -1;
	
	public UserStackFArray() {
		this(capacity);
	}
	
	public T top() {
		return sRep[top];
	}
	
	public UserStackFArray(int cap) {
		capacity = cap;
		sRep = (T[]) new Object[capacity];
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return (top<0);
	}
	
	public boolean isStackFull() {
		return size()==capacity;
	}
	
	public void push(T data) throws Exception {
		if(size()==capacity)
			throw new Exception("Stack is full");
		sRep[++top] = data;
	}
	
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");		
		for(int i=0;i<=top;i++) {
			sb.append(sRep[i]);
			if(i!=top)
				sb.append(", ");
			
		}
		sb.append("]");
		return sb.toString();
			
	}
}
