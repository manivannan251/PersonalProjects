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
		// TODO Auto-generated method stub
		
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

}
