package com.ds.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackUsingLLTest {
	
	StackUsingLL<Integer> stack;
	
	@BeforeEach
	public void ini() {
		stack = new StackUsingLL<Integer>();
	}
	
	@Test
	public void testPush() {
		stack.push(4);
		assertEquals(4, stack.peek());
		stack.push(40);
		assertEquals(40, stack.peek());
		
	}
	
	
	@Test
	public void testIsEmpty() {
		assertTrue(stack.isEmpty());
		stack.push(4);
		assertFalse(stack.isEmpty());
		
	}
	
	
	@Test
	public void testPop() {
		stack.push(4);
		assertEquals(4, stack.peek());
		stack.push(40);
		stack.pop();
		assertEquals(4, stack.peek());		
	}
}
