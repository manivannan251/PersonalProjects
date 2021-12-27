package com.leetcode.problem.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.leetcode.problems.ar.RunningSumArray;

public class TestRunningSum {
	
	@Test
	public void testRunningSum() {
		int[] arr = {1,2,3,4};
		int[] act = RunningSumArray.runningSum(arr);
		int[] exp = {1,3,6,10};
		Assertions.assertArrayEquals(act, exp);
	}
	
	
	@Test
	public void testRunningSum2() {
		int[] arr = {3,1,2,10,1};
		int[] act = RunningSumArray.runningSum(arr);
		int[] exp = {3,4,6,16,17};
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testRunningSum3() {
		int[] arr = {1,1,1,1,1};
		int[] act = RunningSumArray.runningSum(arr);
		int[] exp = {1,2,3,4,5};
		Assertions.assertArrayEquals(act, exp);
	}
}
