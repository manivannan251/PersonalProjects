package com.udemy.hb.avl;

public class AvlNode<T> {
	
	private T data;
	
	private AvlNode<T> left;
	
	private AvlNode<T> right;
	
	private int height;
	
	public AvlNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public AvlNode<T> getLeft() {
		return left;
	}

	public void setLeft(AvlNode<T> left) {
		this.left = left;
	}

	public AvlNode<T> getRight() {
		return right;
	}

	public void setRight(AvlNode<T> right) {
		this.right = right;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "" + data;
	}
	
	
	
}
