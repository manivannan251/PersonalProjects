package com.edu.ds.arr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TestRemoveEven {
	
	@Test
	public void testRemoveEven() {
		int[] arr = {1, 2, 4, 5, 10, 6, 3};
		int[] act = RemoveEven.removeEven(arr);
		int[] exp = {1, 5, 3};
		Assertions.assertArrayEquals(act, exp);
	}
	
	
	
	@Test
	public void testRemoveEven1() {
		int[] arr = {1};
		int[] act = RemoveEven.removeEven(arr);
		int[] exp = {1};
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testRemoveEven2() {
		int[] arr = {2};
		int[] act = RemoveEven.removeEven(arr);
		int[] exp = {};
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testRemoveEven3() {
		int[] arr = {};
		int[] act = RemoveEven.removeEven(arr);
		int[] exp = {};
		Assertions.assertArrayEquals(act, exp);
	}
}
