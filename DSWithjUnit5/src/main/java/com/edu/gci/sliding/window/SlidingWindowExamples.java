package com.edu.gci.sliding.window;

public class SlidingWindowExamples {
	
	public static double[] findAvg(int[] arr,int k) {
		double[] res = new double[arr.length-k+1];
		for(int i=0;i<arr.length-k+1;i++) {
			double sum = 0;
			for(int j=0;j<k;j++) {
				sum = sum + arr[i+j];
			}
			res[i]=sum/k;
		}
		return res;
	}
	
	public static double[] findAvgUsingSlidWind(int[] arr,int k) {
		double[] res = new double[arr.length-k+1];
		double windowSum = 0;
		int windowStart = 0;
		for(int i=0;i<arr.length;i++) {
			windowSum+=arr[i];
			if(i>=k-1) {
				res[windowStart]=windowSum/k;
				windowSum = windowSum-arr[windowStart];
				windowStart++;
			}
			
		}
		return res;
	}
	
	public static int findMaxSubArraySlidWind(int[] arr,int k) {
		int max = 0;
		int sum = 0;
		int wStart = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(i>=k-1) {
				if(sum>max)
					max=sum;
			    sum-=arr[wStart];
			    wStart++;
				
			}
		}
		return max;
	}
}
