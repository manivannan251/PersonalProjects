package com.designgurus.matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RowWithMaxOnesTest {

    @Test
    void findMaxOnesRow() {
        int[][] a1 = {{1, 0,1}, {0,1, 1}, {1, 1,1}};
        System.out.println(Arrays.toString(RowWithMaxOnes.findMaxOnesRow(a1)));

    }
}