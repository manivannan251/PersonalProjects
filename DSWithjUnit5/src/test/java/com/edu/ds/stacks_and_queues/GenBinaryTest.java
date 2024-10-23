package com.edu.ds.stacks_and_queues;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GenBinaryTest {

    @Test
    void generateBinary() {
        String[] res = GenBinary.generateBinary(3);
        System.out.println(Arrays.toString(res));
    }
}