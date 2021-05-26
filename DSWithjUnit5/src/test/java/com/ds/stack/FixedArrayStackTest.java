package com.ds.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FixedArrayStackTest {
	
	private FixedArrayStack<Integer> us;
	
	@BeforeEach
	void init() {
		us = new FixedArrayStack<>();	
	}
	
	@Test
	public void testIsEmpty() {
		System.out.println("First Test Method");				
		assertTrue(us.isEmpty());
	}
	
	@Test
	public void testPush() throws Exception {
		us.push(2);
		us.push(4);
		assertEquals(2, us.size());
	}
	
	@Test
	public void testTop() throws Exception {
		us.push(2);
		assertEquals(2, us.top());
		us.push(4);
		assertEquals(4, us.top());
	}
	
	@Test
	public void testPop() throws Exception {
		us.push(2);
		us.push(4);
		assertEquals(4, us.pop());		
		assertEquals(2, us.top());
		System.out.println(us);
		assertEquals(2, us.pop());
		System.out.println(us);
	}
	
	
	@Test
	public void testStackEmptyException() {
		Throwable ex = null ;
		try {
			us.pop();
		} catch (Exception e) {
			ex = e;
		}
		assertEquals("Stack is empty", ex.getMessage());
	}
	
	@Test
	public void testStackFullException() {
		
		Throwable ex = null ;
		try {
			for(int i=0;i<=9;i++) {
				us.push(i);
			}
		} catch (Exception e) {
			ex = e;
		}
		assertEquals("Stack is full", ex.getMessage());
	}
}
