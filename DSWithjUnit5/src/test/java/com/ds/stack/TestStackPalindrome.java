package com.ds.stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ds.stack.problems.PalindromUsingStack;

public class TestStackPalindrome {
	
	@Test
	public void test1() {
		assertTrue(PalindromUsingStack.isPalindrome("abccba"));
	}
	
	@Test
	public void test2() {
		assertFalse(PalindromUsingStack.isPalindrome("hello"));
	}
	
	
	@Test
	public void test3() {
		assertTrue(PalindromUsingStack.isPalindrome("Don't nod"));
	}
	
	@Test
	public void test4() {
		assertTrue(PalindromUsingStack.isPalindrome("I did, did I?"));
	}
	
	@Test
	public void test5() {
		assertTrue(PalindromUsingStack.isPalindrome("Was it a car or a cat I saw?"));
	}
}
