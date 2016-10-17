package com.medium;

public class GetLevel {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		int k=11;
		System.out.println(getLevel(root,k,1));

		getLevel1(root,k,1);
		
	}

	private static int getLevel1(Node root, int k, int level) {
		if(root==null) return 0;
		if(root.data==k) return level;
		int res=getLevel1(root.left, k, level+1);
		if(res!=0) return res;
		else
			return getLevel1(root.right, k, level+1);
	}

	private static int getLevel(Node root, int k,int level) {
		if(root==null) return 0;
		if(root.data==k) return level;
		int res=0;
		res=getLevel(root.left, k, level+1);
		if(res!=0) return res;
		else
		 return getLevel(root.right, k, level+1); 
	}

}
