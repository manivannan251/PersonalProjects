package com.designgurus.matrix;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagnolSumTest {

    @Test
    void diagnolSum() {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int count = DiagnolSum.diagnolSum(mat);
        Assertions.assertEquals(25,count);
    }
}