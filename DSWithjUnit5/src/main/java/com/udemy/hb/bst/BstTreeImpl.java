package com.udemy.hb.bst;

public class BstTreeImpl<T extends Comparable<T>> implements BstTree<T>{
	
	private BstNode<T> root;
	
	
	@Override
	public void insert(T data) {
		if(root==null) {
			root = new BstNode<>(data);
		} 
		else {
			insert(data,root);
		}
		
	}
	
	private void insert(T data, BstNode<T> node) {
		
		if(node.getData().compareTo(data)>0) {
			if(node.getLeft()!=null) {
				insert(data,node.getLeft());				
			}
			else {
				node.setLeft(new BstNode<>(data));
			}
		}
		else {
			if(node.getRight()!=null) {
				insert(data,node.getRight());				
			}
			else {
				node.setRight(new BstNode<>(data));
			}
		}
	}

	@Override
	public void remove(T data) {
		if(root==null)
			return;
		remove(root,data);
		
	}
	
	private BstNode<T> remove(BstNode<T> node,T data) {
		if(data.compareTo(node.getData())<0) {
			node.setLeft(remove(node.getLeft(), data));
		}
		else if(data.compareTo(node.getData())>0) {
			node.setRight(remove(node.getRight(), data));
		}
		else {
			if(node.getLeft()==null)
				return node.getRight();
			else if(node.getRight()==null)
				return node.getLeft();
			node.setData(getMin(node.getRight()));
			node.setRight(remove(node.getRight(), node.getData()));
		}
		
		return node;
	}

	@Override
	public void traversal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getMin() {
		if(root==null)
			return null;
		
		else
			return getMin(root);
	}
	
	private T getMin(BstNode<T> node) {
		if(node.getLeft()==null)
			return node.getData();
		else
			return getMin(node.getLeft());
		
	}
	
	public void inOrder() {
		if(root==null) {
			return;
		}
		else {
			inOrder(root);
		}
	}
	
	public void inOrder(BstNode<T> root) {
		
		if(root.getLeft()!=null)
			inOrder(root.getLeft());
		
		System.out.print(root.getData()+"-");
		
		if(root.getRight()!=null)
			inOrder(root.getRight());
	}

	@Override
	public T getMax() {
		if(root==null)
			return null;
		
		else
			return getMax(root);
	}
	
	private T getMax(BstNode<T> node) {
		if(node.getRight()==null)
			return node.getData();
		else
			return getMax(node.getRight());
		
	}

	@Override
	public int size() {
		if(root==null) {
			return 0;
		}
		else {
			return getSize(root);
		}
		
	}
	
	private int getSize(BstNode<T> node) {
		int leftTree = node.getLeft()==null?0:getSize(node.getLeft());
		int rightTree = node.getRight()==null?0:getSize(node.getRight());
		int size = 1+leftTree+rightTree;
		return size;
	}
	
	

}
