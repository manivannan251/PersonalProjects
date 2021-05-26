package com.ds.stack;

public class FixedArrayStack<T> {
	
private static int capacity = 10;
	
	private T[] sRep;
	
	private int top = 0;
	
	public FixedArrayStack() {
		this(capacity);
	}
	
	public T top() {
		return sRep[top-1];
	}
	
	public FixedArrayStack(int cap) {
		capacity = cap;
		sRep = (T[]) new Object[capacity];
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return (top==0);
	}
	
	public boolean isStackFull() {
		return size()==capacity-1;
	}
	
	public void push(T data) throws Exception {
		if(isStackFull())
			throw new Exception("Stack is full");
		sRep[top++] = data;
	}
	
	public T pop() throws Exception {
		if(isEmpty())
			throw new Exception("Stack is empty");
		T dat = sRep[top-1];
		sRep[top-1]=null;
		top=top-1;
		return dat;
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
