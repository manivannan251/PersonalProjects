package com.designgurus.stack;

import java.util.EmptyStackException;

public class StackLL<T> {

    private static class Node<T> {
        private T data;

        private Node<T> next;

        private Node(T data) {
            this.data = data;
        }
    }

        private Node<T> top;

        public boolean isEmpty() {
            return top==null;
        }

        public void push(T item) {
            Node<T> newNode = new Node<T>(item);
            newNode.next=top;
            top=newNode;
        }

        public T peek() {
            if(top==null)
                throw new EmptyStackException();
            return top.data;
        }

        public T pop() {
            if(top==null)
                throw new EmptyStackException();
            T item = top.data;
            top = top.next;
            return item;
        }



}
