package com.ds.leetcode.problems.ar;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
	
	public static boolean hasDuplicates1(int[] a) {
		boolean res = false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					res = true;
			}
		}
		return res;
	}
	
	
	public static boolean hasDuplicates2(int[] a) {
		Map<Integer, Integer> dup = new HashMap<>();
		boolean res = false;
		for(int i=0;i<a.length;i++) {
			if(dup.containsKey(a[i])) {
				res = true;
			}
			else {
				dup.put(a[i], 1);
			}
		}
		return res;
	}
}
