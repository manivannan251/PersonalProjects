package com.udemy.hb.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBstImpl {
	
	@Test
	public void testBstInsert() {
		BstTreeImpl<Integer> tree = new BstTreeImpl<Integer>();
		Assertions.assertEquals(0, tree.size());
		tree.insert(12);
		Assertions.assertEquals(1, tree.size());
		
	}
	
	@Test
	public void testBstMax() {
		BstTreeImpl<Integer> tree = new BstTreeImpl<Integer>();
		Assertions.assertEquals(0, tree.size());
		tree.insert(12);
		Assertions.assertEquals(1, tree.size());
		tree.insert(19);
		Assertions.assertEquals(2, tree.size());
		Assertions.assertEquals(19, tree.getMax());
		
	}
	
	@Test
	public void testBstMin() {
		BstTreeImpl<Integer> tree = new BstTreeImpl<Integer>();
		Assertions.assertEquals(0, tree.size());
		tree.insert(12);
		Assertions.assertEquals(1, tree.size());
		tree.insert(19);
		Assertions.assertEquals(2, tree.size());
		Assertions.assertEquals(12, tree.getMin());
		
	}
	
	@Test
	public void testBstInorder() {
		BstTreeImpl<Integer> tree = new BstTreeImpl<Integer>();
		
		tree.insert(12);		
		tree.insert(19);
		tree.insert(2);
		tree.insert(6);
		
		tree.inOrder();
		Assertions.assertEquals(4, tree.size());
		
	}
	
	
	@Test
	public void testBstRemove() {
		BstTreeImpl<Integer> tree = new BstTreeImpl<Integer>();
		
		tree.insert(12);		
		tree.insert(19);	
		tree.inOrder();
		Assertions.assertEquals(2, tree.size());
		tree.remove(19);
		System.out.println("After removing the elements");
		tree.inOrder();
		Assertions.assertEquals(1, tree.size());
		
	}
	
	@Test
	public void testBstRemove2() {
		BstTreeImpl<Integer> tree = new BstTreeImpl<Integer>();
		
		tree.insert(50);		
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		tree.inOrder();
		Assertions.assertEquals(7, tree.size());
		tree.remove(20);
		System.out.println("After removing the elements");
		tree.inOrder();
		Assertions.assertEquals(6, tree.size());
		
	}
	
	@Test
	public void testBstRemove3() {
		BstTreeImpl<Integer> tree = new BstTreeImpl<Integer>();
		
		tree.insert(50);		
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		tree.inOrder();
		Assertions.assertEquals(7, tree.size());
		tree.remove(20);
		tree.remove(30);
		System.out.println("After removing the elements");
		tree.inOrder();
		Assertions.assertEquals(5, tree.size());
		
	}
	
	@Test
	public void testBstRemove4() {
		BstTreeImpl<Integer> tree = new BstTreeImpl<Integer>();
		
		tree.insert(50);		
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		tree.inOrder();
		Assertions.assertEquals(7, tree.size());
		tree.remove(20);
		tree.remove(30);
		tree.remove(50);
		System.out.println("After removing the elements");
		tree.inOrder();
		Assertions.assertEquals(4, tree.size());
		
	}
}
