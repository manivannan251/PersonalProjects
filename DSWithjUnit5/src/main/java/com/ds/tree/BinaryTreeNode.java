
package com.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeNode {
	
	private Node root;	

	public BinaryTreeNode(int data) {
		root = new Node(data);
		
	}
	
	public void add(int data) {
		
		Stack<Node> bt = new Stack<>();
		bt.push(root);
		while(!bt.isEmpty()) {
			Node poppedNode = bt.pop();
			if(data>poppedNode.getData()) {
				Node tempRight = poppedNode.getRight();
				if(tempRight!=null) {
					bt.push(tempRight);
				}
				else {
					poppedNode.setRight(new Node(data));
				}
			}
			else {
				
				Node tempLeft = poppedNode.getLeft();
				if(tempLeft!=null) {
					bt.push(tempLeft);
				}
				else {
					poppedNode.setLeft(new Node(data));
				}
		}
		}
		
	}
	
	/*
	 * private void addRec(Node node,int data) { if(node!=null) {
	 * if(data>node.getData()) { addRec(node.getRight(), data); node.setRight(new
	 * Node(data)); } else { addRec(node.getLeft(), data); node.setLeft(new
	 * Node(data)); } } else { return; }
	 * 
	 * }
	 */

	/*public void preOrderRec() {

		if (root != null) {			
			System.out.println(root.getData());
			this.preOrderRec(root.getLeft());
			preOrderRec(root.getRight());
		}
	}*/
	
	//p
	
	public List<Integer> preOrder() {
		List<Integer> list = new ArrayList<>();
		Stack<Node> bt = new Stack<>();
		bt.push(root);
		while(!bt.isEmpty()) {
			Node temp = bt.pop();
			list.add(temp.getData());
			if(temp.getRight()!=null)
				bt.push(temp.getRight());
			if(temp.getLeft()!=null)
				bt.push(temp.getLeft());
		}
		
		return list;
	}
	
	
	public int getMaximum() {
		int max = Integer.MIN_VALUE;
		
		Stack<Node> bt = new Stack<>();
		bt.push(root);
		while(!bt.isEmpty()) {
			Node temp = bt.pop();
			if(temp.getData()>max)
				max = temp.getData();
			if(temp.getRight()!=null)
				bt.push(temp.getRight());
			if(temp.getLeft()!=null)
				bt.push(temp.getLeft());
		}
		return max;
	}
	
	public int getSize() {
		return size(root);
	}
	
	private int size(Node root) {
		int leftTree = root.getLeft()==null?0:size(root.getLeft());
		int rightTree = root.getRight()==null?0:size(root.getRight());
		return 1+leftTree+rightTree;
	}
 	
	
}
