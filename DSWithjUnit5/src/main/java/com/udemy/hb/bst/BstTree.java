package com.udemy.hb.bst;

public interface BstTree<T> {
	
	public void insert(T data);
	
	public void remove(T data);
	
	public void traversal();
	
	public T getMin();
	
	public T getMax();
	
	public int size();

}
