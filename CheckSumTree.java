package com.medium;

public class CheckSumTree {

	public static void main(String[] args) {
		Node root=new Node(12);
		root.left=new Node(4);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(8);
		root.right.left=new Node(6);
		root.right.right=new Node(2);
		System.out.println(checkSumTree(root));

	}

	private static boolean checkSumTree(Node root) {
		if(root==null || (root.left==null && root.right==null)) return true;
		boolean ans=true;
		ans=ans&&checkSumTree(root.left);
		ans=ans&&checkSumTree(root.right);
		int l=0,r=0;
		if(root.left!=null) l=root.left.data;
		if(root.right!=null) r=root.right.data;
		if(root.data==l+r) return ans&&true;
		else return false;
		
	}

}
