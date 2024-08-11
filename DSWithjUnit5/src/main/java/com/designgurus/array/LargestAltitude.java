package com.designgurus.array;

public class LargestAltitude {

    public static int largestAltitude(int[] height) {
        int max=0;
        int count =0;
        for(int i=0;i<height.length;i++) {
            count=count+height[i];
            if(count>max)
                max=count;
        }
        return max;
    }
}
