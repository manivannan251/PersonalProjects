package com.designgurus.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackLLTest {

    @Test
    void isEmpty() {
        StackLL<Integer> st = new StackLL<Integer>();
        Assertions.assertTrue(st.isEmpty());
        st.push(1);
        Assertions.assertFalse(st.isEmpty());
    }

    @Test
    void push() {
        StackLL<Integer> st = new StackLL<Integer>();
        st.push(33);
        Assertions.assertEquals(33,st.peek());
        st.push(55);
        Assertions.assertEquals(55,st.peek());
    }

    @Test
    void peek() {
        StackLL<Integer> st = new StackLL<Integer>();
        st.push(345);
        int res1 = st.peek();
        Assertions.assertEquals(345,st.peek());
        Assertions.assertFalse(st.isEmpty());
    }

    @Test
    void pop() {
        StackLL<Integer> st = new StackLL<Integer>();
        st.push(345);
        int res1 = st.peek();
        Assertions.assertEquals(345,st.peek());
        Assertions.assertFalse(st.isEmpty());
    }
}