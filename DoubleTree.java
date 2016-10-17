package com.hard;

public class DoubleTree {

	public static void main(String[] args) {
		Node root=new Node(24);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(9);
		//doubleTree(root);
		//traversal(root);
		doubleTree1(root);
		traversal(root);
	}

	private static void doubleTree1(Node root) {
		if(root==null) return;
		doubleTree1(root.left);
		doubleTree1(root.right);
		Node preNode=root.left;
		root.left=new Node(root.data);
		root.left.left=preNode;
	}

	private static void traversal(Node node) {
		if(node==null) return;
		traversal(node.left);
		System.out.print(node.data+" ");
		traversal(node.right);
	}

	private static void doubleTree(Node root) {
		if(root==null) return;
		doubleTree(root.left);
		doubleTree(root.right);
		Node oldleft=root.left;
		root.left=new Node(root.data);
		root.left.left=oldleft;
	}

}
