package linked_lists;

public class CustomLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode first = new ListNode(10);
		ListNode sec = new ListNode(20);
		ListNode third = new ListNode(2);
		CustomLinkedList cl = new CustomLinkedList();
		cl.insert(first);
		cl.insert(sec);
		cl.insert(third);
		cl.insert(new ListNode(56));
		cl.deleteAtBegin();
		cl.insertAtBegin(new ListNode(34));
		System.out.println(cl.toString());
		System.out.println("The size of the list is "+cl.getSizeOfList());

	}

}
