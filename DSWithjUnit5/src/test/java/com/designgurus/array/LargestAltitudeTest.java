package com.designgurus.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestAltitudeTest {

    @Test
    void largestAltitude() {
        int[] slope = {-5,1,5,0,-7};
        int max = LargestAltitude.largestAltitude(slope);
        Assertions.assertEquals(1,max);
        int[] slope1 = {4,-3,2,-1,-2};
        int max1 = LargestAltitude.largestAltitude(slope1);
        Assertions.assertEquals(4,max1);
        int[] slope2 = {2,2,-3,-1,2,1,-5};
        int max2 = LargestAltitude.largestAltitude(slope2);
        Assertions.assertEquals(4,max2);
    }
}