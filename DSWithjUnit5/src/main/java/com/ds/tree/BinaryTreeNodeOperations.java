package com.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeNodeOperations {

	public static void preOrderRec(Node root) {

		if (root != null) {			
			System.out.println(root.getData());
			preOrderRec(root.getLeft());
			preOrderRec(root.getRight());
		}
	}
	
	
}
