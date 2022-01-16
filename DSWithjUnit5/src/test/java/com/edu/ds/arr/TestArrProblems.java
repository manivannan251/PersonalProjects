package com.edu.ds.arr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TestArrProblems {
	
	@Test
	public void testRunningSum() {
		int[] arr1 = {1, 3, 4, 5};
		int[] arr2 = {2, 6, 7, 8};
		int[] act = ArrProblems.mergeSortedArrays(arr1, arr2);
		int[] exp = {1, 2, 3, 4, 5, 6, 7, 8};
		Assertions.assertArrayEquals(act, exp);
	}
	
	
	@Test
	public void testRunningSum2() {
		int[] arr1 = {1, 3, 4, 5};
		int[] arr2 = {2, 6, 7, 8,9};
		int[] act = ArrProblems.mergeSortedArrays(arr1, arr2);
		int[] exp = {1, 2, 3, 4, 5, 6, 7, 8,9};
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testRunningSum3() {
		int[] arr1 = {1, 3, 4, 5,10};
		int[] arr2 = {2, 6, 7, 8,9};
		int[] act = ArrProblems.mergeSortedArrays(arr1, arr2);
		int[] exp = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testRunningSum4() {
		int[] arr1 = {16,17};
		int[] arr2 = {2, 6, 7, 8,9};
		int[] act = ArrProblems.mergeSortedArrays(arr1, arr2);
		int[] exp = {2, 6, 7, 8,9,16,17};
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testTwoSum() {
		int[] arr1 = {1, 21, 3, 14, 5, 60, 7, 6};
		int[] exp = {21, 6};
		int[] act = ArrProblems.getTwoSum(arr1, 27);
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testTwoSum2() {
		int[] arr1 = {9, 4, 7, 2, 6};
		int[] exp = {9, 4, 7, 2, 6};
		int[] act = ArrProblems.getTwoSum(arr1, 17);
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testfindProduct() {
		int[] arr1 = {1,2,3,4};
		int[] exp = {24,12,8,6};
		int[] act = ArrProblems.findProduct(arr1);
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testfindProduct2() {
		int[] arr1 = {4,2,1,5,0};
		int[] exp = {0,0,0,0,40};
		int[] act = ArrProblems.findProduct(arr1);
		Assertions.assertArrayEquals(act, exp);
	}
	
	
	@Test
	public void testfindProductOptimized() {
		int[] arr1 = {1,2,3,4};
		int[] exp = {24,12,8,6};
		int[] act = ArrProblems.findProductOptimized(arr1);
		Assertions.assertArrayEquals(act, exp);
	}
	
	@Test
	public void testfindProductOptimized2() {
		int[] arr1 = {4,2,1,5,0};
		int[] exp = {0,0,0,0,40};
		int[] act = ArrProblems.findProductOptimized(arr1);
		Assertions.assertArrayEquals(act, exp);
	}
	
	
	@Test
	public void testfindMinimu() {
		int[] arr1 = {9, 2, 3, 6};
		int min = ArrProblems.findMinimumValue(arr1);
		Assertions.assertEquals(2, min);
	}
	
	@Test
	public void testfindFirstUnique() {
		int[] arr1 = {9, 2, 3, 2, 6, 6};
		int min = ArrProblems.findFirstUnique(arr1);
		Assertions.assertEquals(9, min);
	}
	
	@Test
	public void testfindFirstUnique2() {
		int[] arr1 = {9, 2, 3, 2, 6, 6,9};
		int min = ArrProblems.findFirstUnique(arr1);
		Assertions.assertEquals(3, min);
	}
	
	
	@Test
	public void testfindFirstUnique3() {
		int[] arr1 = {9, 2, 3, 2, 6, 6,9,3};
		int min = ArrProblems.findFirstUnique(arr1);
		Assertions.assertEquals(-1, min);
	}
	
	@Test
	public void testfindFirstUnique4() {
		int[] arr1 = {4,4,4,3};
		int min = ArrProblems.findFirstUnique(arr1);
		Assertions.assertEquals(3, min);
	}
	
	@Test
	public void testfindSecondLargest() {
		int[] arr1 = {9,2,3,6};
		int min = ArrProblems.findSecondLargest(arr1);
		Assertions.assertEquals(6, min);
	}
	
	
	@Test
	public void testfindSecondLargest2() {
		int[] arr1 = {2,4};
		int min = ArrProblems.findSecondLargest(arr1);
		Assertions.assertEquals(2, min);
	}
	
	@Test
	public void testrotateArray() {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] exp = {5, 1, 2, 3, 4};
		ArrProblems.rotateArray(arr1);
		Assertions.assertArrayEquals(arr1, exp);
	}
}
