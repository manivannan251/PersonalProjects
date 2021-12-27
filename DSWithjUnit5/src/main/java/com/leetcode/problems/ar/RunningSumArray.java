package com.leetcode.problems.ar;

public class RunningSumArray {
	
	
	public static int[] runningSum(int[] arr) {
		int[] sumarr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=i;j>=0;j--) {
				count = count+arr[j];
			}
			sumarr[i]=count;
		}
		return sumarr;
	}
	
	public static int[] runningSum2(int[] arr) {
		int[] sumarr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=i;j>=0;j--) {
				count = count+arr[j];
			}
			sumarr[i]=count;
		}
		return sumarr;
	}
}
