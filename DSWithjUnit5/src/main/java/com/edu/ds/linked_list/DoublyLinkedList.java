package com.edu.ds.linked_list;

public class DoublyLinkedList {

    private int size;

    private Node headNode;

    private Node tailNode;

    public DoublyLinkedList() {
        this.size=0;
        this.headNode=null;
        this.tailNode=null;
    }

    public boolean isEmpty() {
        return headNode == null && tailNode == null;
    }








}
