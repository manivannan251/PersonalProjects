package com.udemy.hb.array;
// find duplicates in array if element are less than array sizembn 
public class DupArray {
	
	public static boolean doesDupExist(int[] arr) {
		boolean val = true;
		for(int i=0;i<arr.length;i++) {
			if(arr[Math.abs(arr[i])]<0) {
				val = false;
			}
			else {
				arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
			}
		}
		
		return val;
	}
}
                                                                                                                 