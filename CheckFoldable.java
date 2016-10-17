package com.hard;

public class CheckFoldable {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		//root.left.right=new Node(5);
		root.right=new Node(8);
		//root.right.left=new Node(7);
		root.right.right=new Node(11);
		System.out.println(checkFoldable(root.left,root.right));
		System.out.println(checkFoldable1(root));

	}

	private static boolean checkFoldable1(Node root) {
		if(root==null) return true;
		else 
			 return checkFoldable1Cust(root.left, root.right);
	}

	private static boolean checkFoldable1Cust(Node root1, Node root2) {
		if(root1==null && root2==null) return true;
		if(root1!=null && root2!=null)
		{
			return checkFoldable1Cust(root1.left, root2.right) && 
					checkFoldable1Cust(root1.left, root2.right);
		}
		//else
			return false;
		
	}

	private static boolean checkFoldable(Node root1,Node root2) {
		if(root1==null && root2==null) return true;
		boolean res=false;;
		if(root1!=null && root2!=null)
		{
			res=checkFoldable(root1.left,root2.right);
			res=res&&checkFoldable(root2.left,root1.right);
			return res;
		}
		return false;
		
	}

}
