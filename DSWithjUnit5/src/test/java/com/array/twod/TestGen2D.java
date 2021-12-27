package com.array.twod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGen2D {
	
	@Test
	public void test1() {
		int[][] exp = Generate2D.gen2dArray(2);
		int[][] act = {{1,2},{3,4}};
		Assertions.assertArrayEquals(exp, act);
		
	}
	
	@Test
	public void test2() {
		int[][] exp = Generate2D.gen2dArray(3);
		int[][] act = {{1,2,3},{4,5,6},{7,8,9}};
		Assertions.assertArrayEquals(exp, act);
		
	}
}
