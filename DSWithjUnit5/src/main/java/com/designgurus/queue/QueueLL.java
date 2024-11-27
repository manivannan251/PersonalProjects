package com.designgurus.queue;

public class QueueLL<T> {

    private static class Node<T> {
        private T data;

        private Node<T> next;

        Node(T data) {
            this.data = data;
            this.next=null;
        }
    }

    private Node<T> front,rear;

    private int size;

    public boolean isEmpty() {
        return size==0;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if(rear==null) {
            front=rear=newNode;
        } else {
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }

    public T peek() {
        if(front==null)
            return null;
        return front.data;
    }

    public int size() {
        return size;
    }

    public T dequeue() {
        if(front==null)
            return null;
        T data = front.data;
        front = front.next;
        if(front==null)
            rear=null;
        size--;
        return data;
    }

}
