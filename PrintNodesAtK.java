package com.medium;

public class PrintNodesAtK {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		int k=2;
		//printNodes(root,k);
		printNodes1(root,k);

	}

	private static void printNodes1(Node root, int k) {
		if(root==null) return;
		if(k==0) System.out.print(root.data+" ");
		printNodes1(root.left, k-1);
		printNodes1(root.right, k-1);
		
	}

	private static void printNodes(Node root, int k) {
		if(root==null) return;
		if(k==0)
			System.out.print(root.data+" ");
		printNodes(root.left, k-1);
		printNodes(root.right, k-1);
	}

}
