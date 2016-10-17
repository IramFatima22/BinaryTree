package com.medium;

public class CountLeaves {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		//root.left.left=new Node(1);
		//root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		System.out.println(countLeaves(root));
		System.out.println(countLeaves1(root));

	}

	private static int countLeaves1(Node root) {
		if(root.left==null && root.right==null)
			return 1;
		int count=0;
		if(root.left!=null)
			count+=countLeaves1(root.left);
		if(root.right!=null)
			count+=countLeaves1(root.right);
		return count;

		
		
	}

	private static int countLeaves(Node root) {
		int count=0;
		if(root.left==null && root.right==null)
			return ++count;
		if(root.left!=null)
			count+= countLeaves(root.left);
		if(root.right!=null)
			count+= countLeaves(root.right);
		return count;
	}

}
