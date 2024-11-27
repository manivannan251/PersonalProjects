package com.designgurus.queue;

import java.util.EmptyStackException;

public class CircularQueue {

    private int[] queue;

    private int front,rear,size;

    public CircularQueue(int size) {
        this.size=size;
        front=-1;
        rear=-1;
        queue = new int[size];

    }

    public boolean isFull() {
        return (rear+1)%size==front;
    }

    public boolean isEmpty() {
        return front==-1;
    }

    public void enqueue(int val) {
        if(isFull())
            throw new StackOverflowError("Stack is full");
        if(isEmpty())
            front=0;
        rear=(rear+1)%size;
        queue[rear]=val;
    }

    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return queue[front];
    }

    public int dequeue() {
        if(isEmpty())
            throw new EmptyStackException();
        int val = queue[front];
        if(front==rear) {
            front=-1;
            rear=-1;
        }
        front=(front+1)%size;
        return val;
    }

    public void display() {
        if(isEmpty())
            System.out.println("Queue is empty");
        System.out.print("Queue :");
        int i=front;
        do {
            System.out.print(queue[i]+" ");
            i=(i+1)%size;
        } while (i!=(rear+1)%size);
        System.out.println();
    }


}
