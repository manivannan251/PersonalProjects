package com.ds.stack;

import java.util.Arrays;

public class DynamicArrayStack<T> {
	
	private static int capacity = 10;
	
	private T[] sRep;
	
	private int top=0;
	
	public DynamicArrayStack() {
		this(capacity);
	}
	
	public DynamicArrayStack(int initialCapacity) {
		capacity = initialCapacity;
		sRep = (T[]) new Object[capacity];
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return (top==0);
	}
	
	public T top() throws Exception {
		if(isEmpty())
			throw new Exception("Stack is empty");
		return sRep[--top];
	}
 	
	public void push(T data) {
		if(size()==capacity-1) {
			capacity=capacity*2;
			T[] temp = (T[]) new Object[capacity];
			System.arraycopy(sRep, 0, temp, 0, sRep.length);
			sRep = temp;
		}
		sRep[top++]=data;
			
	}
	
	public T pop() throws Exception {
		if(size()==0)
			throw new Exception("Stack is empty");
		T data = sRep[top-1];
		sRep[top-1]=null;
		top=top-1;
		return data;
	}
 }
