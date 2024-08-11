package com.designgurus.array;

public class TestUtils {

    public static boolean compareArrays(int[] act,int[] exp) {
        boolean res = false;
        if(act.length!=exp.length)
            return res;
        for(int i=0;i<act.length;i++) {
            if(act[i]!=exp[i])
                return res;
        }
        res = true;
        return res;
    }
}
