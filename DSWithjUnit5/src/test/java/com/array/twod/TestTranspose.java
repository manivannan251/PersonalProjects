package com.array.twod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTranspose {
	
	@Test
	public void test1() {
		int[][] act = TransposeMatrix.getTransposeMatrix(Generate2D.gen2dArray(2));
		int[][] exp = {{1,3},{2,4}};
		Assertions.assertArrayEquals(exp, act);
	}
	
	
	@Test
	public void test2() {
		int[][] act = TransposeMatrix.getTransposeMatrix(Generate2D.gen2dArray(3));
		int[][] exp = {{1,4,7},{2,5,8},{3,6,9}};
		Assertions.assertArrayEquals(exp, act);
	}
}
