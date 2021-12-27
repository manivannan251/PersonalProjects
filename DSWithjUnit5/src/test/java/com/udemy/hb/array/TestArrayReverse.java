package com.udemy.hb.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArrayReverse {
	
	@Test
	public void test1() {
		int nums[] = {1,2,3,4,5};
		int exp[] = {5,4,3,2,1};
		int act[] = ArrayReverse.reverseArray(nums);
		Assertions.assertArrayEquals(exp, act);
	}
	
	
	@Test
	public void test2() {
		int nums[] = {1,2,3,4,5,6};
		int exp[] = {6,5,4,3,2,1};
		int act[] = ArrayReverse.reverseArray(nums);
		Assertions.assertArrayEquals(exp, act);
	}
	
	@Test
	public void test3() {
		int nums[] = {55};
		int exp[] = {55};
		int act[] = ArrayReverse.reverseArray(nums);
		Assertions.assertArrayEquals(exp, act);
	}
}
