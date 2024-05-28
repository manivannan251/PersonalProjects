package com.designgurus.array;

import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] num) {
        if(num.length<1) {
            return false;
        }
        Arrays.sort(num);
        for(int i=0;i<num.length-1;i++) {
            if(num[i]==num[i+1])
                return true;
        }
        return false;
    }
}
