package com.edu.ds.stacks_and_queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void isEmpty() {
        Queue<Integer> queue = new Queue<>(5);
        Assertions.assertTrue(queue.isEmpty());
        queue.enqueue(7);
        queue.deque();

        Assertions.assertTrue(queue.isEmpty());
        queue.enqueue(9);
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    void enqueue() {
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(4);
        queue.enqueue(6);
        Assertions.assertEquals(4,queue.peek());
    }

    @Test
    void peek() {
        Queue<Integer> queue = new Queue<>(5);
        Assertions.assertNull(queue.peek());
    }

    @Test
    void deque() {
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(4);
        queue.enqueue(6);
        Assertions.assertEquals(4,queue.deque());
        Assertions.assertEquals(6,queue.deque());
        Assertions.assertTrue(queue.isEmpty());
        queue.enqueue(8);
        Assertions.assertEquals(8,queue.deque());
    }

    @Test
    void isFull() {
        Queue<Integer> queue = new Queue<>(3);
        queue.enqueue(9);
        queue.enqueue(3);
        Assertions.assertFalse(queue.isFull());
        queue.enqueue(77);
        Assertions.assertTrue(queue.isFull());
        queue.deque();
        Assertions.assertFalse(queue.isFull());
    }

    @Test
    void isFull2() {
        Queue<Integer> queue = new Queue<>(3);
        queue.enqueue(9);
        queue.deque();

        queue.enqueue(77);
        queue.enqueue(33);


        Assertions.assertFalse(queue.isFull());
    }
}