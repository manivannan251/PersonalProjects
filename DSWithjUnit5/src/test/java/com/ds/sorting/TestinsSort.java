package com.ds.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestinsSort {
	
	@Test
	public void test1() {
		int[] arr = {6,8,1,4,5,3,7,2};
		int[] exp = {1,2,3,4,5,6,7,8};
		Inssort.insSert(arr);
		Inssort.print(arr);
		Assertions.assertArrayEquals(arr, exp);
	}
}
