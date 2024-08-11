package com.designgurus.array;
/*
A bike rider is going on a ride. The road contains n + 1 points at different altitudes. The rider starts from point 0 at an altitude of 0.

Given an array of integers gain of length n, where gain[i] represents the net gain in altitude between points i and i + 1 for all (0 <= i < n), return the highest altitude of a point.

 Example 1
Input: gain = [-5, 1, 5, 0, -7]
Expected Output: 1
Justification: The altitude changes are [-5, -4, 1, 1, -6], where 1 is the highest altitude reached.
 */
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
