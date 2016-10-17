package com.hard;

public class HeightBalanced {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.left.right.right=new Node(12);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		int res=checkIfHeightBalanced(root);
		if(res==-1)
			System.out.println("Not balanced");
		else
			System.out.println("Balanced");
		int x=checkIfHeightBalanced1(root);
		System.out.println(x);


	}

	private static int checkIfHeightBalanced1(Node root) {
		if(root==null) return 0;
		int l=checkIfHeightBalanced1(root.left);
		int r=checkIfHeightBalanced1(root.right);
		if(Math.abs(l-r)>1 || l==-1 ||r==-1)
			return -1;
		else
			return 1+Math.max(l, r);
		
	}

	private static int checkIfHeightBalanced(Node root) {
		if(root==null) return 0;
		int l=checkIfHeightBalanced(root.left);
		int r=checkIfHeightBalanced(root.right);
		if(l==-1 || r==-1 || Math.abs(l-r)>1) return-1;
		else
			return Math.max(l+1, r+1);
	}

}
