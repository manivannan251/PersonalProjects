package com.edu.ds.arr;

public class RemoveEven {
	
	public static int[] removeEven(int[] arr) {
		int oddSize = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddSize++;
			}
		}
		int[] oddArr = new int[oddSize];
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddArr[j]=arr[i];
				j++;
			}
		}
		
		return oddArr;
	}
}
