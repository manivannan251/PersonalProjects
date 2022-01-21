package com.udemy.hb.avl;

public class AvlTreeImpl<T extends Comparable<T>> implements AvlTree<T>{
	
	private AvlNode<T> root;

	@Override
	public void insert(T data) {
		if(root==null)
			root = new AvlNode<T>(data);
		else
			insert(root,data);
		
	}

	private void insert(AvlNode<T> node, T data) {
		if(node.getData().compareTo(data)>0) {
			if(node.getLeft()!=null)
				insert(node.getLeft(),data);
			else
				node.setLeft(new AvlNode<T>(data));
		}
		else {
			if(node.getRight()!=null)
				insert(node.getRight(),data);
			else
				node.setRight(new AvlNode<T>(data));
		}
		
		updateHeight(node);
		
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverse() {
		// TODO Auto-generated method stub
		
	}
	
	private void updateHeight(AvlNode<T> node) {
		node.setHeight(Math.max(height(node.getLeft()), height(node.getLeft()))+1);
	}
	
	private int getBalance(AvlNode<T> node) {
		if(node==null)
			return 0;
		return height(node.getLeft())-height(node.getRight());
	}
	
	private void rightRotation(AvlNode<T> node) {
		AvlNode<T> temp = node.getLeft();
		AvlNode<T> grandChild = temp.getRight();
		temp.setRight(node);
		node.setLeft(grandChild);
		updateHeight(node);
		updateHeight(temp);
	}
	
	
	private int height(AvlNode<T> node) {
		if(node==null)
			return -1;
		return node.getHeight();
					
	}
	
	
	public int size() {
		if(root==null)
			return 0;
		else
			return getSize(root);
	}

	private int getSize(AvlNode<T> node) {
		int left = node.getLeft()==null?0:getSize(node.getLeft());
		int right = node.getRight()==null?0:getSize(node.getRight());
		return 1+left+right;
		
	}
	
	

}
