package com.ds.sorting;

public class Inssort {

	public static void main(String[] args) {
		//int[] arr = {12,11,13,5,6};
		int[] arr = {6,8,1,4,5,3,7,2};
		System.out.println("Before Sorting");
		print(arr);
		System.out.println("After sorting");
		insSert(arr);
		print(arr);

	}
	
	public static void print(int[] arr) {
		System.out.print("[ ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("]");
	}
	
	public static void insSert(int[] arr) {
		
		for(int i=1;i<=arr.length-1;i++) {
			int p = arr[i];
			int j=i;
			while(j>=1&&arr[j-1]>p) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j]=p;
		}
	}
	
	

}
