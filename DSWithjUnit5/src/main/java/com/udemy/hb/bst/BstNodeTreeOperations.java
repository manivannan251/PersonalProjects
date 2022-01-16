package com.udemy.hb.bst;

public class BstNodeTreeOperations {
	
	public static <T> boolean compareTrees(BstNode<T> tree,BstNode<T> tree2) {
		
		if(tree==null||tree2==null) return tree==tree2;
		
		if(!((tree.getData()).equals(tree2.getData()))){
			return false;
		}
		
		return compareTrees(tree.getLeft(), tree2.getLeft())&&compareTrees(tree.getRight(), tree2.getRight());
		
	}
}
