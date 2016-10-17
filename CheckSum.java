package com.hard;

public class CheckSum {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.left.right.right=new Node(12);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		//root.right.right.left=new Node(4);
		int x=10;
		System.out.println(checkSum(root,x));
		System.out.println(checkSum1(root,x));

	}

	private static boolean checkSum1(Node root, int x) {
		x=x-root.data;
		if(root.left==null && root.right==null)
			return (x==0);
		boolean ans=false;
		if(root.left!=null)
			ans=ans||checkSum1(root.left, x);
		if(root.right!=null)
			ans= ans||checkSum1(root.right, x);
		return ans;
	}

	private static boolean checkSum(Node root, int x) {
		if(root.left==null && root.right==null)
			return (x==root.data);
		boolean ans=false;
		if(root.left!=null)
			ans=ans || checkSum(root.left, x-root.data);
		if(root.right!=null)
			ans=ans||checkSum(root.right, x-root.data);
		return ans;
	}

}
