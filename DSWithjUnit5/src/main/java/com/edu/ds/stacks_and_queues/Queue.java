package com.edu.ds.stacks_and_queues;

public class Queue<T> {

    private T[] elements;

    private int size;

    private int front;

    private int back;

    private int count;

    public Queue(int size) {
        this.size = size;
        elements = (T[]) new Object[size];
        front=-1;
        back=-1;
    }

    public boolean isFull() {
        return count==size;
    }

    public boolean isEmpty() {
        return count==0;
    }

    public void enqueue(T element) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        if(isEmpty()) {
            elements[++back]=element;
            front++;
            count++;
            return;
        }
        elements[++back]=element;
        count++;
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }
        return elements[front];
    }

    public T deque() {
        if(isEmpty())
            throw new RuntimeException("Queue is empty");
        count--;
        return elements[front++];
    }
}
