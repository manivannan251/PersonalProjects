package com.udemy.hb.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLinkedListNode {
	
	@Test
	public void testAdd() {
		LinkedListNode<String> ll = new LinkedListNode<String>();
		ll.insert("Kohli");
		ll.insert("Rohit");
		ll.insert("Dhoni");
		Assertions.assertEquals(3, ll.size());
	}
	
	
	@Test
	public void testRemove() {
		LinkedListNode<String> ll = new LinkedListNode<String>();
		ll.insert("Kohli");
		ll.insert("Rohit");
		ll.insert("Dhoni");
		ll.remove("Rohit");
		Assertions.assertEquals(2, ll.size());
	}
	
	@Test
	public void testGetMiddleOdd() {
		LinkedListNode<String> ll = new LinkedListNode<String>();
		ll.insert("Kohli");
		ll.insert("Rohit");
		ll.insert("Dhoni");		
		Assertions.assertEquals("Rohit", ll.getMiddleNode());
	}
	
	@Test
	public void testGetMiddleEven() {
		LinkedListNode<String> ll = new LinkedListNode<String>();
		ll.insert("Kohli");
		ll.insert("Rohit");
		ll.insert("Dhoni");	
		ll.insert("Raina");	
		Assertions.assertEquals("Dhoni", ll.getMiddleNode());
	}
}
