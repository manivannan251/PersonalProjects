package com.ds.linked.list;



public class LinkedList<T> {
	
private int length;
	
	ListNode<T> head;
	
	public LinkedList() {
		length = 0;
	}
	
	public void addAtBegin(ListNode<T> node) {
		if(node!=null) {
				node.setNext(head);
				head = node;
				length++;
		}
		
	}
	
	public void addAtPosition(T data, int pos) {
		if(pos < 0)
			pos = 0;
		
		if(pos > length)
			pos = length;
		
		if(pos==0) {
			addAtBegin(new ListNode<T>(data));
			return;
		}
		
		ListNode<T> temp = head;
		ListNode<T> newNode = new ListNode<T>(data);
		int count = 0;
		while(count<pos-1) {			
			temp = temp.getNext();
			count++;
			
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		length++;
		
		
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public T removeFromBegin() {
		if(head==null) 
			return null;
		T dat = head.getData();
		head = head.getNext();
		length--;
		return dat;
	}
	
	
	
	public void removeFromEnd() {
		if(head==null) 
			return;
		ListNode<T> temp = head;
		ListNode<T> prev = null;
		while(temp.getNext()!=null) {
			prev=temp;
			temp = temp.getNext();
		}
		prev.setNext(null);
		length--;
	}
	
	public T getFirstElement() {
		return head.getData();
	}
	
	public T getElementAtPos(int pos) {
		if(pos < 0)
			pos = 0;
		
		if(pos > length)
			pos = length;
		
		ListNode<T> temp = head;
		int count = 0;
		while(temp.getNext()!=null) {
			if(count!=pos-1) {
			temp = temp.getNext();
			count++;
			}
			else {
				break;
			}
		}
		return temp.getData();
	}
	
	public void add(ListNode<T> node) {
		if(node!=null) {
		if(head == null)
			head = node;
		else {
			ListNode<T> headNode = head;
			ListNode<T> dataNode = null;
			while(headNode!=null) {
				dataNode = headNode;
				headNode = headNode.getNext();
			}
			dataNode.setNext(node);
		}
		length++;
		}
		
	}
	
	public int getLength() {
		return length;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		ListNode<T> temp = head;
		while(temp!=null) {
			sb.append(temp.getData());
			if(temp.getNext()!=null)
				sb.append(",");
			temp = temp.getNext();
		}
		sb.append("] ");
		return sb.toString();
	}
}
