package com.udemy.hb.avl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TestAvlTree {
	
	@Test
	public void testAvlInsert() {
		AvlTreeImpl<Integer> tree = new AvlTreeImpl<Integer>();
		Assertions.assertEquals(0, tree.size());
		tree.insert(12);
		Assertions.assertEquals(1, tree.size());
		
	}

}
