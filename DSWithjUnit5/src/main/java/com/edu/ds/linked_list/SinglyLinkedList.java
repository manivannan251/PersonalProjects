package com.edu.ds.linked_list;

import java.util.HashSet;

public class SinglyLinkedList<T> {

    private int size;

    private Node headNode;

    public SinglyLinkedList() {
        this.size = 0;
        this.headNode = null;

    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNextNode(headNode);
        headNode = newNode;
        size++;

    }

    public void insertAtEnd(T data) {
        if(isEmpty()){
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.setData(data);
        Node lastNode = headNode;
        while(lastNode.getNextNode()!=null) {
            lastNode = lastNode.getNextNode();
        }
        lastNode.setNextNode(newNode);
        size++;

    }

    public void insertAfter(T data,T previous) {
        Node newNode = new Node();
        newNode.setData(data);
        Node currentNode = headNode;
        while (currentNode.getNextNode()!=null && !currentNode.getData().equals(previous)) {
            currentNode=currentNode.getNextNode();
        }
        if (currentNode.getData().equals(previous)) {
            newNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(newNode);
            size++;
        }
    }

    public boolean searchList(T data) {
        Node currentNode = headNode;
        while (currentNode!=null) {
            if(currentNode.getData().equals(data)) {
                return true;
            }
            currentNode=currentNode.getNextNode();
        }
        return false;
    }

    public void deleteAtHead() {
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        headNode = headNode.getNextNode();
        size--;
    }

    public void deleteValue(T data) {
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = headNode;
        Node prev = null;
        if(current.getData().equals(data)) {
            deleteAtHead();
            return;
        }
        while(current!=null) {
            if(current.getData().equals(data)) {
                prev.setNextNode(current.getNextNode());
                size--;
            }
            prev = current;
            current = current.getNextNode();
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = headNode;
        while (temp!=null) {
            System.out.print(temp.getData().toString()+"->");
            temp=temp.getNextNode();
        }
        System.out.println("NULL");
    }

    public void removeDuplicatesWithHashing() {
        Node current = this.headNode;
        Node prev = this.headNode;
        HashSet<T> visitedNodes = new HashSet<>();
        if(!isEmpty() && current.getNextNode()!=null) {
            while(current!=null) {
                if(visitedNodes.contains(current.getData())) {
                    prev.setNextNode(current.getNextNode());
                    current = current.getNextNode();
                } else {
                    visitedNodes.add((T) current.getData());
                    prev = current;
                    current=current.getNextNode();

                }
            }
        }
    }


}
