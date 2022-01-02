package com.udemy.hb.bst;

public class BstNode<T> {
	
	private T data;
	
	private BstNode<T> left;
	
	private BstNode<T> right;
	
	public BstNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BstNode<T> getLeft() {
		return left;
	}

	public void setLeft(BstNode<T> left) {
		this.left = left;
	}

	public BstNode<T> getRight() {
		return right;
	}

	public void setRight(BstNode<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "" + data;
	}
	
	
}
