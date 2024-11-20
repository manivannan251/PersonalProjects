package com.designgurus.matrix;

public class DiagnolSum {

    public static int diagnolSum(int[][] mat) {
        int count=0;
        int n = mat.length;
        for(int i=0;i<n;i++) {
            count+=mat[i][i]+mat[i][n-i-1];
        }
        if(n%2!=0)
            count-=mat[n/2][n/2];
        return count;
    }
}
