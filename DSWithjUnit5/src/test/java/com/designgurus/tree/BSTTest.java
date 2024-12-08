package com.designgurus.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    @Test
    void insert() {
        BST<Integer> bst = new BST<>();
        bst.insert(5);
        bst.insert(4);
        Assertions.assertTrue(bst.search(4));
    }

    @Test
    void inOrder() {
        BST<Integer> bst = new BST<>();
        bst.insert(5);
        bst.insert(2);
        bst.insert(8);
        bst.insert(6);
        bst.insert(3);
        bst.insert(1);

        bst.insert(9);
        bst.inOrder();
    }

    @Test
    void preOrder() {
        BST<Integer> bst = new BST<>();
        bst.insert(5);
        bst.insert(2);
        bst.insert(8);
        bst.insert(6);
        bst.insert(3);
        bst.insert(1);

        bst.insert(9);
        bst.preOrder();
    }

    @Test
    void postOrder() {
        BST<Integer> bst = new BST<>();
        bst.insert(5);
        bst.insert(2);
        bst.insert(8);
        bst.insert(6);
        bst.insert(3);
        bst.insert(1);

        bst.insert(9);
        bst.postOrder();
    }

    @Test
    void deleteValue() {
        BST<Integer> bst = new BST<>();
        bst.insert(5);
        bst.insert(4);
        Assertions.assertTrue(bst.search(4));
        bst.deleteValue(4);
        Assertions.assertFalse(bst.search(4));
    }

    @Test
    void search() {
        BST<Integer> bst = new BST<>();
        bst.insert(5);
        bst.insert(4);
        bst.insert(6);
        Assertions.assertTrue(bst.search(6));
    }
}