package com.ds.stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ds.stack.problems.ValidSymbolPatternDemo;

public class TestStackBalanced {
	
	@Test
	public void test1() {
		assertTrue(ValidSymbolPatternDemo.isValidSymbolPattern("(A+B)"));
		
	}
	
	@Test
	public void test2() {
		
		assertTrue(ValidSymbolPatternDemo.isValidSymbolPattern("(A+B)+(c-d)"));
		
	}
	
	@Test
	public void test3() {
		
		assertFalse(ValidSymbolPatternDemo.isValidSymbolPattern("((A+B)+(c-d)}"));
	}
	
	
	@Test
	public void test4() {
		
		assertTrue(ValidSymbolPatternDemo.isValidSymbolPattern("{(A+B)+[c-d]}"));
	}
	
	@Test
	public void test5() {
		
		assertTrue(ValidSymbolPatternDemo.isValidSymbolPattern(""));
	}
}
