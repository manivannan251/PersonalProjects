package com.leetcode.problems.ar;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
	
	
	public static int subArraySum(int[] num,int add) {
		int count=0;
		Map<Integer,Integer> aMap = new HashMap<>();
		for(int i=0;i<num.length;i++) {
			if(num[i]==add)
				count++;
			if(aMap.containsKey(num[i])) {
				count++;
			}
			else {
				aMap.put(add-num[i], null);
			}
			
		}
		return count;
	}
}
