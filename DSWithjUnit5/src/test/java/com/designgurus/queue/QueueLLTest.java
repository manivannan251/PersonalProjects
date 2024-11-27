package com.designgurus.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueLLTest {

    @Test
    void isEmpty() {
        QueueLL<Integer> q = new QueueLL<>();
        Assertions.assertTrue(q.isEmpty());
        q.enqueue(12);
        Assertions.assertFalse(q.isEmpty());
    }

    @Test
    void peek() {
        QueueLL<Integer> q = new QueueLL<>();
        Assertions.assertNull(q.peek());
        q.enqueue(12);
        int first = q.peek();
        Assertions.assertEquals(first,12);
    }

    @Test
    void testSize() {
        QueueLL<Integer> q = new QueueLL<>();
        int size = q.size();
        Assertions.assertEquals(0,size);
        q.enqueue(12);
        int size2 = q.size();
        Assertions.assertEquals(1,size2);
    }

    @Test
    void testDeque() {
        QueueLL<Integer> q = new QueueLL<>();

        q.enqueue(12);
        q.enqueue(24);
        Assertions.assertEquals(12,q.peek());
        q.dequeue();
        Assertions.assertEquals(24,q.peek());
        q.dequeue();
        Assertions.assertTrue(q.isEmpty());
    }
}