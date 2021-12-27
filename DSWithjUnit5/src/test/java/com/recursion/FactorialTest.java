package com.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
	
	@Test
	public void test1() {
		int num = Factorial.fact(4);
		Assertions.assertEquals(24,num);
	}
	
	
	@Test
	public void test2() {
		int num = Factorial.fact(5);
		Assertions.assertEquals(120,num);
	}
}
