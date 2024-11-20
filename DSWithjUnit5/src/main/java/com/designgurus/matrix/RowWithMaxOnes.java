    package com.designgurus.matrix;

    public class RowWithMaxOnes {

        public static int[] findMaxOnesRow(int[][] mat) {
            int maxOnesIdx = 0;
            int maxOnesCount = 0;
            // ToDo: Write Your Code Here.
            for(int i=0;i<mat.length;i++) {
                int count=0;
                for(int j=0;j<mat[i].length;j++) {
                    count=mat[i][j]+count;
                }
                if(count>maxOnesCount) {
                    maxOnesCount=count;
                    maxOnesIdx=i;
                }
            }
            return new int[]{maxOnesIdx, maxOnesCount};
        }
    }
