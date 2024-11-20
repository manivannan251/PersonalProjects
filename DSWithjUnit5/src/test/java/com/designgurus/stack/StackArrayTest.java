package com.designgurus.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayTest {

    @Test
    void isEmpty() {
        StackArray<Integer> st = new StackArray<>(5);
        Assertions.assertTrue(st.isEmpty());
        st.push(1);
        Assertions.assertFalse(st.isEmpty());
    }

    @Test
    void push() {
        StackArray<Integer> st = new StackArray<>(5);
        st.push(33);
        Assertions.assertEquals(33,st.peek());
        st.push(55);
        Assertions.assertEquals(55,st.peek());
    }

    @Test
    void pop() {
        StackArray<Integer> st = new StackArray<>(5);
        st.push(33);
        int res = st.pop();
        Assertions.assertEquals(33,res);
        Assertions.assertTrue(st.isEmpty());
    }

    @Test
    void peek() {
        StackArray<Integer> st = new StackArray<>(5);
        st.push(345);
        int res1 = st.peek();
        Assertions.assertEquals(345,st.peek());
        Assertions.assertFalse(st.isEmpty());
    }
}