package com.edu.gci.sliding.window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSlidingWindow {
	
	@Test
	public void test1() {
		int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
		double[] res = SlidingWindowExamples.findAvg(arr, 5);
		double[] exp = {2.2, 2.8, 2.4, 3.6, 2.8};
		Assertions.assertArrayEquals(exp, res);
	}
	
	@Test
	public void test2() {
		int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
		double[] res = SlidingWindowExamples.findAvgUsingSlidWind(arr, 5);
		double[] exp = {2.2, 2.8, 2.4, 3.6, 2.8};
		Assertions.assertArrayEquals(exp, res);
	}
	
	@Test
	public void test3() {
		int[] arr = {2, 1, 5, 1, 3, 2};
		int res = SlidingWindowExamples.findMaxSubArraySlidWind(arr, 3);		
		Assertions.assertEquals(9, res);
	}
	
	@Test
	public void test4() {
		int[] arr = {2, 3, 4, 1, 5};
		int res = SlidingWindowExamples.findMaxSubArraySlidWind(arr, 2);		
		Assertions.assertEquals(7, res);
	}
}
