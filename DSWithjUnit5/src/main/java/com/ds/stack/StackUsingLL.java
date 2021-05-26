package com.ds.stack;

import com.ds.linked.list.LinkedList;
import com.ds.linked.list.ListNode;

public class StackUsingLL<T> {
	
	LinkedList<T> sll;
	
	public StackUsingLL() {
		sll = new LinkedList<>();
	}
	
	public void push(T data) {
		ListNode<T> node = new ListNode<>(data);
		sll.addAtBegin(node);		
	}
	
	
	public T pop() {
		return sll.removeFromBegin();
	}
	
	public boolean isEmpty() {
		return sll.isEmpty();
	}
	
	
	public T peek() {
		return sll.getFirstElement();
	}
	
	
	@Override
	public String toString() {
		return sll.toString();
	}
	
	
	
}
