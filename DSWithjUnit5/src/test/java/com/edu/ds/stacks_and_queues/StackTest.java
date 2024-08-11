package com.edu.ds.stacks_and_queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void isEmpty() {
        Stack<Integer> intStack = new Stack<>(2);
        Assertions.assertTrue(intStack.isEmpty());
    }

    @Test
    void isFull() {
        Stack<Integer> intStack = new Stack<>(2);
        Assertions.assertFalse(intStack.isFull());
    }

    @Test
    void top() {
        Stack<Integer> intStack = new Stack<>(2);
        intStack.push(10);
        Assertions.assertEquals(10,intStack.top());
    }

    @Test
    void push() {
        Stack<Integer> intStack = new Stack<>(2);
        intStack.push(10);
        intStack.push(67);
        Assertions.assertEquals(67,intStack.top());
    }

    @Test
    void pop() {
        Stack<Integer> intStack = new Stack<>(2);
        intStack.push(10);
        intStack.push(67);
        Assertions.assertEquals(67,intStack.pop());
        Assertions.assertEquals(10,intStack.pop());
        Assertions.assertTrue(intStack.isEmpty());
    }
}