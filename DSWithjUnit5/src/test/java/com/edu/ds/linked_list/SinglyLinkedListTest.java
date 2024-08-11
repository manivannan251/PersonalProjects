package com.edu.ds.linked_list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void isEmpty() {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        assertTrue(sll.isEmpty());
    }

    @Test
    void insertAtHead() {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.insertAtHead("Z");
        sll.printList();
        sll.insertAtHead("A");
        sll.printList();
    }

    @Test
    void insertAtEnd() {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.insertAtHead("Z");
        sll.printList();
        sll.insertAtEnd("A");
        sll.printList();
    }

    @Test
    void insertAfter() {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.insertAtHead("Z");
        sll.printList();
        sll.insertAtEnd("A");
        sll.printList();
        sll.insertAfter("C","Z");
        sll.printList();
    }

    @Test
    void testSearch() {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.insertAtHead("Z");
        sll.insertAtEnd("A");
        sll.insertAfter("C","Z");
        assertTrue(sll.searchList("C"));
        assertFalse(sll.searchList("L"));
    }

    @Test
    void testDeleteAtHead() {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.insertAtHead("Z");
        sll.insertAtEnd("A");
        sll.insertAfter("C","Z");
        sll.deleteAtHead();
        sll.printList();
    }

    @Test
    void testDeleteByValue() {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.insertAtHead("Z");
        sll.insertAtEnd("A");
        sll.insertAfter("C","Z");
        sll.printList();
        sll.deleteValue("C");
        sll.printList();

    }

    @Test
    void testRemoveDuplicates() {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.insertAtHead("Z");
        sll.insertAtEnd("A");
        sll.insertAfter("C","Z");
        sll.insertAtHead("A");
        sll.printList();
        sll.removeDuplicatesWithHashing();
        sll.printList();
        sll.insertAtHead("W");
        sll.printList();


    }


}