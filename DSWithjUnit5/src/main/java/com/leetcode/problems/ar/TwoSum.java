package com.leetcode.problems.ar;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSumMap(int[] arr,int tgt) {
		int[] res = new int[2];
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				res[0] = map.get(arr[i]);
				res[1] = i;
			}
			else {
				map.put(tgt-arr[i], i);
			}
		}
		return res;
	}
}
