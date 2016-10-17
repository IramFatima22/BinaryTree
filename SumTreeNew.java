package com.medium;

public class SumTreeNew {

	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(-2);
		root.left.left=new Node(8);
		root.left.right=new Node(-4);
		root.right=new Node(6);
		root.right.left=new Node(7);
		root.right.right=new Node(5);
		sumTreeNew(root);
		Node.Intraverse(root);
		

	}

	private static int sumTreeNew(Node root) {
		if(root==null) return 0;
		int l=0,r=0;
		if(root.left!=null) l=root.left.data;
		if(root.right!=null) r=root.right.data;
		int ln=sumTreeNew(root.left);
		int rn=sumTreeNew(root.right);
		int sum=ln+rn+l+r;
		root.data=sum;
		return sum;
	}

}
