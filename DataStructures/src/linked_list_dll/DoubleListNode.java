package linked_list_dll;

import linked_list.ListNode;
import linked_list.Userlist;

public class DoubleListNode<T>{	
	
	private T data;
	
	private DoubleListNode<T> prev;
	
	
	private DoubleListNode<T> next;
	
	
	public DoubleListNode(T data) {
		this.data = data;
		prev = null;
		next = null;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public DoubleListNode<T> getPrev() {
		return prev;
	}


	public void setPrev(DoubleListNode<T> prev) {
		this.prev = prev;
	}


	public DoubleListNode<T> getNext() {
		return next;
	}


	public void setNext(DoubleListNode<T> next) {
		this.next = next;
	}
	
	
	
	
	
	

}
