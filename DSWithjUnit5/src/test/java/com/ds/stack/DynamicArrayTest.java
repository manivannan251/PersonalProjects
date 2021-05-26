package com.ds.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DynamicArrayTest {
	
	private DynamicArrayStack<Integer> ds;
	
	@BeforeEach
	public void init() {
		ds = new DynamicArrayStack<Integer>();
	}
	
	@Test
	public void testSize() {
		assertEquals(0, ds.size());
	}
	
	@Test
	public void testPush() {
		ds.push(2);
		assertEquals(1, ds.size());
		ds.push(4);
		assertEquals(2, ds.size());
	}
	
	@Test
	public void testTop() throws Exception {
		ds.push(2);
		assertEquals(2, ds.top());
		ds.push(4);
		assertEquals(4, ds.top());
	}
	
	@Test
	public void testPop() throws Exception {
		ds.push(2);		
		ds.push(4);
		assertEquals(4, ds.pop());
		ds.push(7);
		assertEquals(7, ds.pop());
		assertEquals(1, ds.size());
	}
}
