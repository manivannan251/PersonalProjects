package com.udemy.hb.linkedlist;

public interface ILinkedList<T> {
	
	public void insert(T data);
	
	public void remove(T data);
	
	public int size();
	
	public void traverse();
	
	public T getMiddleNode();
	
	
}
