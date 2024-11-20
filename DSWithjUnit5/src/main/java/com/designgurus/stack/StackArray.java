package com.designgurus.stack;

import java.util.EmptyStackException;

public class StackArray<T> {

    private Object[] arr;

    private int top;

    public StackArray(int size) {
        arr = new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public void push(T item) {
        if(top==arr.length-1) {
            throw new IndexOutOfBoundsException("Stack is full");

        }
        arr[++top]=item;
    }

    public T pop() {
        if(isEmpty())
            throw new EmptyStackException();
        T item = (T) arr[top];
        arr[top--]=null;
        return item;
    }

    public T peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return (T) arr[top];
    }
}
