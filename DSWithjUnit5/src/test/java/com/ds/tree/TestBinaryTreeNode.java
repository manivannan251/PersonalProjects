package com.ds.tree;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinaryTreeNode {
	
	@Test
	public void test1() {
		BinaryTreeNode node = new BinaryTreeNode(1);
		node.add(0);
		node.add(2);
		node.add(3);
		//node.setLeft(new Node(2));
		//node.setRight(new Node(3));
		List<Integer> exp = Stream.of(1,0,2,3).collect(Collectors.toList());
		List<Integer> act = node.preOrder();
		Assertions.assertEquals(exp, act);
	}
	
	@Test
	public void test2() {
		BinaryTreeNode node = new BinaryTreeNode(1);
		node.add(0);
		node.add(2);
		node.add(5);
		//node.setLeft(new Node(2));
		//node.setRight(new Node(3));
		List<Integer> exp = Stream.of(1,0,2,5).collect(Collectors.toList());
		List<Integer> act = node.preOrder();
		Assertions.assertEquals(exp, act);
	}
	
	
	@Test
	public void test3() {
		BinaryTreeNode node = new BinaryTreeNode(5);
		node.add(0);
		node.add(2);
		node.add(7);
		//node.setLeft(new Node(2));
		//node.setRight(new Node(3));
		List<Integer> exp = Stream.of(5,0,2,7).collect(Collectors.toList());
		List<Integer> act = node.preOrder();
		Assertions.assertEquals(exp, act);
	}
	
	@Test
	public void test4() {
		BinaryTreeNode node = new BinaryTreeNode(1);
		node.add(2);
		node.add(3);
		node.add(4);
		node.add(5);node.add(6);node.add(7);
		//node.setLeft(new Node(2));
		//node.setRight(new Node(3));
		List<Integer> exp = Stream.of(1,2,4,5,3,6,7).collect(Collectors.toList());
		List<Integer> act = node.preOrder();
		
		Assertions.assertEquals(7, node.getMaximum());
	}
	
	
	@Test
	public void test5() {
		BinaryTreeNode node = new BinaryTreeNode(1);
		node.add(2);
		node.add(3);
		node.add(4);
		node.add(19);	
		
		Assertions.assertEquals(19, node.getMaximum());
	}
	
	
	@Test
	public void testTreeSize() {
		BinaryTreeNode node = new BinaryTreeNode(1);
		
		
		Assertions.assertEquals(1, node.getSize());
	}
	
	
	@Test
	public void testTreeSize2() {
		BinaryTreeNode node = new BinaryTreeNode(1);
		node.add(8);
		node.add(4);
		Assertions.assertEquals(3, node.getSize());
	}
}
