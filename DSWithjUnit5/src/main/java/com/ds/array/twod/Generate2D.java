package com.ds.array.twod;

public class Generate2D {
	
	public static int[][] gen2dArray(int n) {
		int[][] arr = new int[n][n];
		if(n==0) {
			return arr; 
		}
		int count = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = count;
				count++;
			}
		}
		return arr;
	}
}
