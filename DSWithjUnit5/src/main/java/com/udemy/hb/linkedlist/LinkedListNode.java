package com.udemy.hb.linkedlist;

public class LinkedListNode<T extends Comparable<T>> implements ILinkedList<T>{
	
	private Node<T> root;
	
	private int numOfItems;
	
	@Override
	public void insert(T data) {
		if(root==null) {
			root = new Node<>(data);
		}
		else {
			insertBegining(data);
			
		}
		numOfItems++;
	}

	private void insertBegining(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
		
	}
	
	private void insertEnd(T data,Node<T> node) {
		if(node.getNextNode()!=null) {
			insertEnd(data, node.getNextNode());
		}
		else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
		
	}

	@Override
	public void remove(T data) {
		
		if(root==null) return;
		
		if(root.getData().compareTo(data)==0) {
			root = root.getNextNode();
		}
		else {
			remove(data,root,root.getNextNode());
		}
		numOfItems--;
	}
	
	private void remove(T data, Node<T> prev,Node<T> actual) {
			while(actual!=null) {
				if(actual.getData().compareTo(data)==0) {
					
					prev.setNextNode(actual.getNextNode());
					actual=null;
					return;
				}
				prev = actual;
				actual = actual.getNextNode();
			}
	}

	@Override
	public int size() {		
		return numOfItems;
	}

	@Override
	public void traverse() {
		if(root==null)
			return;
		Node<T> actNode = root;
		while(actNode!=null) {
			System.out.println(actNode);
			actNode = actNode.getNextNode();
		}
		
	}

	@Override
	public T getMiddleNode() {
		Node<T> fastPointer = root;
		Node<T> slowPointer = root;
		while(fastPointer.getNextNode()!=null && fastPointer.getNextNode().getNextNode()!=null) {
			slowPointer = slowPointer.getNextNode();
			fastPointer = fastPointer.getNextNode().getNextNode();
		}
		return slowPointer.getData();
	}

}
