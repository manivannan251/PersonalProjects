package linked_lists;

public class CustomLinkedList {
	
	private int length;
	
	ListNode head;
	
	public CustomLinkedList() {
		length = 0;
	}
	
	public ListNode getHead() {
		return head;
	}
	
	public void insert(ListNode node) {
		ListNode temp,last;
		if(head==null)
			head=node;
		else {
			temp = head.getNext();
			last = head;
			while(temp!=null ) {
				last = temp;
				temp = temp.getNext();				
			
			}
			last.setNext(node);		
			
		}
		length++;
	}
	
	public void insertAtBegin(ListNode node) {
		//ListNode temp = head;
		node.setNext(head);
		head = node;
		length++;
	}
	
	public void deleteAtBegin() {
		ListNode temp = head;
		head = head.getNext();
		temp=null;
		length--;
	}
	
	public int getSizeOfList() {
		return length;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		if(head==null)
			return result.append("]").toString();
		result.append(head.getData());
		ListNode temp = head.getNext();
		while(temp!=null) {
			result.append(",");
			result.append(temp.getData());
			temp = temp.getNext();
		}
		return result.append("]").toString();
	}
}
