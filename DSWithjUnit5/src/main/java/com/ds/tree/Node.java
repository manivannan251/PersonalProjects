package com.ds.tree;

public class Node {
	
	private Integer data;
	
	private Node left;
	
	private Node right;

	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public Integer getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	
	
	
		
	
}
