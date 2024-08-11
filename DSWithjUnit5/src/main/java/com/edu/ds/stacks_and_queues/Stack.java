package com.edu.ds.stacks_and_queues;

public class Stack<T> {

    private int top;

    private int maxSize;

    private T[] arr;

    public Stack(int size) {
        this.top = -1;
        this.maxSize = size;
        arr = (T[]) new Object[size];
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        return top==maxSize-1;

    }

    public T top() {
        if(isEmpty())
            return null;
        return arr[top];
    }

    public void push(T element) {
        if(isFull())
            throw new RuntimeException("Stack is full");
        arr[++top] = element;
    }

    public T pop() {
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        return arr[top--];
    }
}
