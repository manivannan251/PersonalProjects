package com.designgurus.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumTest {

    @Test
    void runningSum() {
        int[] arr = {-1,2,-3,4,-5};
        int[] runningSum = RunningSum.runningSum(arr);
        Arrays.stream(runningSum).forEach(System.out::println);
    }
}