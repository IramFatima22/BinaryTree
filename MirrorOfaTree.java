package com.medium;

public class MirrorOfaTree {

	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(4);
		root.right=new Node(13);
		root.left.left=new Node(2);
		root.left.right=new Node(6);
		root.right.left=new Node(11);
		root.right.right=new Node(15);
		//mirror(root);
		mirrorImage(root);
		
		traverse(root);
	}

	private static Node mirrorImage(Node root) {
		if(root==null) return null;
		Node l=mirrorImage(root.left);
		Node r=mirrorImage(root.right);
		root.right=l;
		root.left=r;
		return root;
		
	}

	private static void traverse(Node root) {
		if(root==null) return;
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);
		
	}

	private static void mirror(Node root) {
		if(root==null) return;
		mirror(root.left);
		mirror(root.right);
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;		
	}

}
