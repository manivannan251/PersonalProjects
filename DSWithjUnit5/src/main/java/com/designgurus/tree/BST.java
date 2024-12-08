package com.designgurus.tree;

public class BST<T extends Comparable<T>>{

    private TreeNode<T> root;

    public void insert(T value) {
        TreeNode<T> node = new TreeNode<>(value);
        if(root==null) {
            root = node;
        } else {
            TreeNode<T> current = root;
            TreeNode<T> parent = null;
            while(current!=null) {
                parent=current;
                if(value.compareTo(current.data)<0) {
                    current=current.left;
                } else {
                    current=current.right;
                }
            }
            if(value.compareTo(parent.data)<0) {
                parent.left=node;
            } else {
                parent.right=node;
            }
        }
    }

    private TreeNode<T> findMin(TreeNode<T> current) {
        if(current.left==null) {
            return current;
        }
        return findMin(current.left);
    }

    private TreeNode<T> deleteNode(TreeNode<T> root, T value) {
        if(root==null) {
            return root;
        }
        if (value.compareTo(root.data)<0) {
            root.left = deleteNode(root.left,value);
        } else if(value.compareTo(root.data)>0) {
            root.right = deleteNode(root.right,value);
        }  else {
            if(root.left==null) {
                return root.right;
            } else if (root.right==null) {
                return root.left;
            } else {
                TreeNode<T> temp = findMin(root.right);
                root.data = temp.data;
                root.right = deleteNode(root.right, temp.data);
            }
        }
        return root;
    }

    public void deleteValue(T value) {
        root = deleteNode(root,value);
    }

    public boolean search(T value) {
        TreeNode<T> current = root;
        while(current!=null) {
            if(value==current.data) {
                return true;
            }
            else if(value.compareTo(current.data)<0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    private void inOrderHelper(TreeNode<T> node) {
        if (node!=null) {
            inOrderHelper(node.left);
            System.out.print(node.data+" ");
            inOrderHelper(node.right);
        }
    }

    public void inOrder() {
        inOrderHelper(root);
        System.out.println();
    }

    private void preOrderHelper(TreeNode<T> node) {
        if (node!=null) {
            System.out.print(node.data+" ");
            preOrderHelper(node.left);
            preOrderHelper(node.right);
        }
    }

    public void preOrder() {
        preOrderHelper(root);
        System.out.println();
    }

    private void postOrderHelper(TreeNode<T> node) {
        if (node!=null) {
            postOrderHelper(node.left);
            postOrderHelper(node.right);
            System.out.print(node.data+" ");
        }
    }

    public void postOrder() {
        postOrderHelper(root);
        System.out.println();
    }


}
