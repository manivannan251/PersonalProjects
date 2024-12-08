package com.designgurus.tree;

public class TreeNode<T> {

    public TreeNode<T> left;

    public T data;

    public TreeNode<T> right;

    public TreeNode(T value) {
        this.data = value;
        left=null;
        right=null;
    }
}
