package linked_list;

import java.util.ArrayList;
import java.util.List;

public class UserLinkListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ListNode<Integer> node1 = new ListNode<Integer>(32);
		ListNode<Integer> node2 = new ListNode<Integer>(45);
		ListNode<Integer> node3 = new ListNode<Integer>(77);
		ListNode<Integer> node4 = new ListNode<Integer>(104);
		ListNode<Integer> node5 = new ListNode<Integer>(104);
		ll.add(node1);
		ll.add(node2);
		ll.add(node3);
		ll.addAtBegin(node4);
		System.out.println("The length of linked List is "+ll.getLength());
		System.out.println(ll);
		ll.addAtBegin(node5);
		System.out.println(ll);
		System.out.println("The length of linked List is "+ll.getLength());
		System.out.println("The first element of linked List is "+ll.getFirstElement());
		System.out.println("The third element of linked List is "+ll.getElementAtPos(3));
		System.out.println("The length of linked List is "+ll.getLength());
		System.out.println(ll);
		ll.removeFromBegin();
		System.out.println("The length of linked List is "+ll.getLength());
		System.out.println(ll);
		ll.addAtPosition(23, 0);
		System.out.println("The length of linked List is "+ll.getLength());
		System.out.println(ll);
		ll.removeFromEnd();
		System.out.println("Removing last element from list");
		System.out.println("The length of linked List is "+ll.getLength());
		System.out.println(ll);
		ll.removeFromEnd();
		System.out.println("Removing last element from list");
		System.out.println("The length of linked List is "+ll.getLength());
		System.out.println(ll);
		
		

	}

}
