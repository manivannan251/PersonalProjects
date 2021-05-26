package linked_list_dll;

import linked_list.ListNode;
import linked_list.Userlist;

public class DoubleLinkedList<T>  implements Userlist<T>{

	private int length;
	
	private DoubleListNode<T> head;
	
	private DoubleListNode<T> tail;
	
	
	public DoubleLinkedList() {
		length = 0;
	}
	
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public void addFirst(T data) {
		DoubleListNode<T> tempNode = new DoubleListNode<>(data);
		
		
		
	}

	@Override
	public void addLast(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromLast() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		String str = "[";
		DoubleListNode<T> temp = head;
		while(temp!=tail) {
			str = str+temp.getData();
			if(temp.getNext()!=null)
				str = str + ",";
			temp = temp.getNext();
		}
		str = str+"]";
		return str;
	}

}
