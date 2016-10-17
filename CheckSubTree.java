package com.hard;

public class CheckSubTree {

	public static void main(String[] args) {
		Node root1=new Node(6);
		root1.left=new Node(3);
		root1.left.left=new Node(1);
		root1.left.right=new Node(5);
		root1.left.right.right=new Node(12);
		root1.right=new Node(8);
		root1.right.left=new Node(7);
		root1.right.right=new Node(11);
		Node root2=new Node(3);
		root2.left=new Node(1);
		root2.right=new Node(5);
		root2.right.right=new Node(12);
		System.out.println(checkSubTree(root1,root2));
	}

	private static boolean checkSubTree(Node root1, Node root2) {
		if(root1==null) return false;
		if(root1.data==root2.data) 
		{
			if(matchNodes(root1,root2))
				return true;
		}
		boolean ans=false;
		ans=ans||checkSubTree(root1.left, root2);
		ans=ans||checkSubTree(root1.right, root2);
		return ans;
	}

	private static boolean matchNodes(Node root1, Node root2) {
		if(root1==null && root2==null) return true;
		if(root1!=null && root2!=null)
		{
			return root1.data==root2.data&&
		matchNodes(root1.left, root2.left)&& matchNodes(root1.right, root2.right);
			
		}
		return false;
		
	}

}
