package com.designgurus.grokking75.array;
/*
There are n kids with candies. You are given a candies array containing integers, where candies[i] denotes the number of candies the ith kid has, and an integer extraCandies, represents the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving all the extraCandies to the ith kid, he/she will have the maximum number of candies among all the kids, or false otherwise.

Note: Multiple kids can have the maximum number of candies.

Examples
Example 1:

Input: candies = [7, 3, 9, 2, 4], extraCandies = 5
Expected Output: [true, false, true, false, true]
Justification: If you give all extraCandies to:
Kid 1, they will have 7 + 5 = 12 candies, which is the maximum among the kids.
Kid 2, they will have 3 + 5 = 8 candies, which is not the greatest among the kids.
Kid 3, they will have 9 + 5 = 14 candies, which is the greatest among the kids.
Kid 4, they will have 2 + 5 = 7 candies, which is not the greatest among the kids.
Kid 5, they will have 4 + 5 = 9 candies, which is the greatest among the kids.
Example 2:

Input: candies = [5, 8, 6, 4, 2], extraCandies = 3
Expected Output: [true, true, true, false, false]
Justification: Giving 3 extra candies to the first, second, and third kid will make their totals 8, 11, and 9 respectively, which are the highest. Other kids can't reach these totals.
Example 3:

Input: candies = [1, 2, 3, 4, 5], extraCandies = 4
Expected Output: [true, true, true, true, true]
Justification: Giving 4 extra candies to each kid will make their totals 5, 6, 7, 8, and 9 respectively, which means they all can potentially have the highest number of candies.*/

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {



    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int greatest = 0;
        for(int i=0;i<candies.length;i++) {
            if (candies[i]>greatest)
                greatest=candies[i];
        }
        for(int i=0;i<candies.length;i++) {
            if(candies[i]+extraCandies>=greatest)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
