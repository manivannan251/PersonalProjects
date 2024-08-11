package com.designgurus.matrix;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class RichesrtCustomerTest {

    @Test
    void getRichestCustomer() {
        int[][] nums = {{5,2,3},{0,6,7}};
        int rc = RichesrtCustomer.getRichestCustomer(nums);
        Assertions.assertEquals(13,rc);
        int[][] nums2 = {{30,300},{200,20},{10,100}};
        int rc2 = RichesrtCustomer.getRichestCustomer(nums2);
        Assertions.assertEquals(330,rc2);
    }
}