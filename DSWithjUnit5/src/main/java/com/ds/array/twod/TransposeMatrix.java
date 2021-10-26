package com.array.twod;

public class TransposeMatrix {
	
	public static int[][] getTransposeMatrix(int[][] arr) {
		
		int[][] newarr = new int[arr.length][arr[0].length];
		for(int i=0;i<newarr.length;i++) {
			for(int j=0;j<newarr[0].length;j++) {
				newarr[i][j] = arr[j][i];
			}
		}
		return newarr;
	}

}
