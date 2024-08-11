package com.designgurus.array;

public class FindDifferenceArray {

    public static int[] findDifferenceArray(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] difference = new int[nums.length];
        leftSum[0]=nums[0];
        rightSum[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<leftSum.length;i++) {
            leftSum[i]=nums[i]+leftSum[i-1];
        }
        for(int i=rightSum.length-2;i>=0;i--) {
            rightSum[i]=nums[i]+rightSum[i+1];

        }
        for(int i=0;i<difference.length;i++) {
            difference[i]=Math.abs(rightSum[i]-leftSum[i]);
        }
        return difference;

    }
}
