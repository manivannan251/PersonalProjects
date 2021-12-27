package com.leetcode.problem.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.leetcode.problems.ar.Duplicates;

public class TestDuplicates {
	
	@Test
	public void test1() {
		int[] a = {1,6,33,23,4,3,6};
		boolean exp = Duplicates.hasDuplicates1(a);
		Assertions.assertEquals(true, exp);
	}
	
	@Test
	public void test2() {
		int[] a = {1,6,33,23,4,3,6};
		boolean exp = Duplicates.hasDuplicates2(a);
		Assertions.assertEquals(true, exp);
	}
	
	
	@Test
	public void test3() {
		int[] a = {1,6,33,23,4,3};
		boolean exp = Duplicates.hasDuplicates2(a);
		Assertions.assertEquals(false, exp);
	}
}
