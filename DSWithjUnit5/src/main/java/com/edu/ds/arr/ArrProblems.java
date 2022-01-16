package com.edu.ds.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ArrProblems {
	
	//merge two sorted arrays
	public static int[] mergeSortedArrays(int[] arr1,int[] arr2) {
		int size = arr1.length+arr2.length;
		int[] mergeArr = new int[size];
		for(int i=0,j=0,k=0;i<mergeArr.length;i++) {			
			if(j<arr1.length && k<arr2.length) {
				if(arr1[j]<=arr2[k]) {
					mergeArr[i]=arr1[j];
							j++;
				}
				else {
					mergeArr[i]=arr2[k];
					k++;
				}
			}
			else if (j<arr1.length) {
				mergeArr[i]=arr1[j];
				j++;
			}
			
			else if (k<arr2.length) {
				mergeArr[i]=arr2[k];
				k++;
			}
		}
		
		return mergeArr;
	}
	
	public static int[] getTwoSum(int[] arr,int sum) {
		int[] res = new int[2];
		boolean found = false;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				res[0] = map.get(arr[i]);
				res[1] = arr[i];
				found = true;
			}
			else {
				map.put(sum-arr[i], arr[i]);
			}
		}
		if(found) 
			return res;
		else
			return arr;
	}
	
	//array of products except itself
	public static int[] findProduct(int[] arr) {
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int prod = 1;
			for(int j=0;j<arr.length;j++) {
				if(i==j)
					continue;
				prod = prod*arr[j];
			}
			res[i]=prod;
		}
		return res;
	}
	
	//array of products except itself optimized solution
		public static int[] findProductOptimized(int[] arr) {
			int[] left = new int[arr.length];
			int[] right = new int[arr.length];
			int[] result = new int[arr.length];
			left[0] = 1;right[arr.length-1]=1;
			for(int i=1;i<arr.length;i++) {
				left[i] = left[i-1] * arr[i-1];
			}
			for(int i=arr.length-2;i>=0;i--) {
				right[i] = right[i+1] * arr[i+1];
			}
			for(int i=0;i<arr.length;i++) {
				result[i] = left[i] * right[i];
			}
			return result;
		}
		
		public static int findMinimumValue(int[] arr) {
			int min = arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<min)
					min=arr[i];
			}
			return min;
		}
		
		public static int findFirstUnique(int[] arr) {
			int result = -1;
			
			//Arrays.sort(arr);
			for(int i=0;i<arr.length;i++) {
				int temp = arr[i];
				boolean found = false;
				for(int j=arr.length-1;j>=0;j--) {
					if(i==j)
						continue;
					if(arr[j]==temp) {
						found = true;
					}
						
				}
				if(!found) {
					result = arr[i];
					break;
				}
			}
			return result;
		} 
		
		public static int findSecondLargest(int[] arr) {
			if(arr.length<2)
				return -1;
			if(arr.length==2) {
				return arr[0]>arr[1]?arr[1]:arr[0];
			}
			int first = arr[0];
			int second = arr[1];
			
			for(int i=2;i<arr.length;i++) {
				if(arr[i]>first) {
					second = first;
					first = arr[i];
				}
				else if(arr[i]>second) {
					second = arr[i];
				}
			}
			
			return second;
		}
		
		public static void rotateArray(int[] arr) {
			int[] temp = new int[arr.length];
			int first = arr[arr.length-1];
			for(int i=1;i<arr.length;i++) {
				temp[i]=arr[i-1];
			}
			temp[0]=first;
			for(int i=0;i<arr.length;i++) {
				arr[i]=temp[i];
			}
		}
}
