package com.leetcode.problem.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.leetcode.problems.ar.TwoSum;

public class TestTwoSum {
	
	@Test
	public void testTwoSummap1() {
		int[] arr = {2,7,11,15};
		int[] actRes = TwoSum.twoSumMap(arr, 9);
		int[] expRes = {0,1};
		Assertions.assertArrayEquals(actRes, expRes);
		
	}
	
	
	@Test
	public void testTwoSummap2() {
		int[] arr = {3,2,4};
		int[] actRes = TwoSum.twoSumMap(arr, 6);
		int[] expRes = {1,2};
		Assertions.assertArrayEquals(actRes, expRes);
		
	}
	
	@Test
	public void testTwoSummap3() {
		int[] arr = {3,3};
		int[] actRes = TwoSum.twoSumMap(arr, 6);
		int[] expRes = {0,1};
		Assertions.assertArrayEquals(actRes, expRes);
		
	}
}
