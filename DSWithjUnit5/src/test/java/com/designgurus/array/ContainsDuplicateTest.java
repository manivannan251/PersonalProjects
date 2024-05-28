package com.designgurus.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        int nums[] = {1,2,3,4,1};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicate(nums));
        int nums1[] = {1,2,3,4};
        Assertions.assertFalse(ContainsDuplicate.containsDuplicate(nums1));
    }
}