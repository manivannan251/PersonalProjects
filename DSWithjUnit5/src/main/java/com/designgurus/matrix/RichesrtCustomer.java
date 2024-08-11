package com.designgurus.matrix;
/*
You are given an m x n matrix accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.

Return the wealth that the richest customer has.

Imagine every customer has multiple bank accounts, with each account holding a certain amount of money. The total wealth of a customer is calculated by summing all the money across all their multiple.

Examples
Example 1:

Input: [[5,2,3],[0,6,7]]
Expected Output: 13
Justification: The total wealth of the first customer is 10 and of the second customer is 13. So, the output is 13 as it's the maximum among all customers.
Example 2:

Input: [[1,2],[3,4],[5,6]]
Expected Output: 11
Justification: Total wealth for each customer is [3, 7, 11]. Maximum of these is 11.
 */
public class RichesrtCustomer {

    public static int getRichestCustomer(int[][] num) {
        int count = 0;
        for(int i=-0;i< num.length;i++) {
            int count2 = 0;
            for(int j=0;j<num[i].length;j++) {
                count2 = count2+num[i][j];
            }
            if(count2>count)
                count=count2;
        }
        return count;
    }
}
