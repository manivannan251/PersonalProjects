package com.designgurus.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindDifferenceArrayTest {

    @Test
    void findDifferenceArray() {
        int[] initial = {2,5,1,6};
        int[] act = FindDifferenceArray.findDifferenceArray(initial);
        int[] exp = {12,5,1,8};
        Assertions.assertTrue(TestUtils.compareArrays(act,exp));
    }

    @Test
    void findDifferenceArray1() {
        int[] initial = {3,3,3};
        int[] act = FindDifferenceArray.findDifferenceArray(initial);
        int[] exp = {6,0,6};
        Assertions.assertTrue(TestUtils.compareArrays(act,exp));
    }

    @Test
    void findDifferenceArray3() {
        int[] initial = {1,2,3,4,5};
        int[] act = FindDifferenceArray.findDifferenceArray(initial);
        int[] exp = {14,11,6,1,10};
        Assertions.assertTrue(TestUtils.compareArrays(act,exp));
    }
}