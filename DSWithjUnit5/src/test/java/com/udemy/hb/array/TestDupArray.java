package com.udemy.hb.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDupArray {
	
	@Test
	public void test1() {
		int arr[] = {1,3,3,2,1};
		Assertions.assertFalse(DupArray.doesDupExist(arr));
	}
}
