package com.udemy.hb.array;

public class ArrayReverse {
	
	
	public static int[] reverseArray(int nums[]) {
		
		for(int i=0,j=nums.length-1;i<=j;i++,j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		
		return nums;
	}

}
