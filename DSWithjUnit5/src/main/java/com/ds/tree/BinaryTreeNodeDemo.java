package com.ds.tree;

public class BinaryTreeNodeDemo {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.setLeft(new Node(2));
		node.setRight(new Node(3));
		BinaryTreeNodeOperations.preOrderRec(node);
		//BinaryTreeNodeOperations.preOrderItr(node);
		

	}

}
