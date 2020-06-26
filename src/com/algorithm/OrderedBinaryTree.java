package com.algorithm;

/*
Considering this graph as an input:
			1
		  /  \
		 2    3
		/ \    \
		4   5    6
 			/   / \
		    7  8   9
*/
public class OrderedBinaryTree {

	static class Node{
		int data;
		Node right;
		Node left;
	};
	static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.left = temp.right = null;
		return temp;
	}
	static void traverseLeaves(Node root) {
		if(root == null)
			return;
		
		if(root.left == null && root.right == null) {
			System.out.print("Returning leaves from Right to Left: "+root.data+ "\n");
			return;
		}
		
		if(root.right != null) 
			traverseLeaves(root.right);   //checking for leaf if exist
		
		if(root.left != null)
			traverseLeaves(root.left);
	}
	
	public static void main(String args[]) throws java.lang.Exception{
		
		Node root = newNode(1);
		root.left = newNode(2);  
	    root.right = newNode(3);  
	    root.left.left = newNode(4);  
	    root.left.right = newNode(5);  
	    root.right.right = newNode(7);  
	    root.right.left = newNode(6);  
	    root.right.left.left = newNode(8);  
	    root.right.right.left = newNode(9);  
	    traverseLeaves(root);
	}
}