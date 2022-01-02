package com.udemy.hb.linkedlist;

public class DLLNode<T extends Comparable<T>> {

	private T data;
	
	private DLLNode<T> firstNode;
	
	
	private DLLNode<T> prevNode;
	
	public DLLNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DLLNode<T> getFirstNode() {
		return firstNode;
	}

	public void setFirstNode(DLLNode<T> firstNode) {
		this.firstNode = firstNode;
	}

	public DLLNode<T> getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DLLNode<T> prevNode) {
		this.prevNode = prevNode;
	}

	@Override
	public String toString() {
		return "DLLNode [data=" + data + "]";
	}
	
	

}
