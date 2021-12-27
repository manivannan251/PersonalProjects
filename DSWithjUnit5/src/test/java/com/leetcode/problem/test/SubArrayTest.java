package com.leetcode.problem.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.leetcode.problems.ar.SubArraySum;

public class SubArrayTest {
	
	@Test
	public void test1() {
		int[] arr = {1,1,1};
		int act = SubArraySum.subArraySum(arr, 2);
		Assertions.assertEquals(2, act);
	}
	
	
	@Test
	public void test2() {
		int[] arr = {1,2,3};
		int act = SubArraySum.subArraySum(arr, 3);
		Assertions.assertEquals(2, act);
	}
	
	@Test
	public void test3() {
		int[] arr = {1,2};
		int act = SubArraySum.subArraySum(arr, 3);
		Assertions.assertEquals(1, act);
	}
	
	
	@Test
	public void test4() {
		int[] arr = {1,7,9};
		int act = SubArraySum.subArraySum(arr, 3);
		Assertions.assertEquals(0, act);
	}

}
