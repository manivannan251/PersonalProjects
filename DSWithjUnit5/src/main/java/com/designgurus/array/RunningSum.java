package com.designgurus.array;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] runninSumArray = new int[nums.length];
        int total = 0;
        for(int i=0;i<nums.length;i++) {
            total=total+nums[i];
            runninSumArray[i]=total;
        }
        return runninSumArray;
    }
}
