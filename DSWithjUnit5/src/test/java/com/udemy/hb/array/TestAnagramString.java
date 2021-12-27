package com.udemy.hb.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAnagramString {
	
	@Test
	public void test1() {
		boolean result = AnagramString.isAnagram("restful", "fluster");
		Assertions.assertTrue(result);
	}
}
