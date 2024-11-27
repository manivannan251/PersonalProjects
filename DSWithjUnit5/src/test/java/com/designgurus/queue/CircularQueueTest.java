package com.designgurus.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularQueueTest {

    @Test
    void isFull() {
        CircularQueue cq = new CircularQueue(5);
        Assertions.assertFalse(cq.isFull());
    }

    @Test
    void isEmpty() {
        CircularQueue cq = new CircularQueue(5);
        Assertions.assertTrue(cq.isEmpty());
    }

    @Test
    void enqueue() {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(12);
        cq.display();
        int val = cq.peek();
        Assertions.assertEquals(10,
                val);
    }

    @Test
    void dequeue() {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(12);
        cq.display();
        int val = cq.peek();
        Assertions.assertEquals(10,
                val);
        cq.dequeue();
        int val2 = cq.peek();
        Assertions.assertEquals(12,
                val2);

    }

    @Test
    void display() {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(12);
        cq.enqueue(990);
        cq.enqueue(10);
        cq.display();
    }
}