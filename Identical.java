package com.medium;


public class Identical {

	public static void main(String[] args) {
		Node root1=new Node(6);
		root1.left=new Node(3);
		root1.left.left=new Node(1);
		root1.left.right=new Node(5);
		root1.right=new Node(8);
		root1.right.left=new Node(7);
		root1.right.right=new Node(11);
		
		Node root2=new Node(6);
		root2.left=new Node(3);
		root2.left.left=new Node(1);
		root2.left.right=new Node(5);
		root2.right=new Node(8);
		root2.right.left=new Node(7);
		root2.right.right=new Node(11);
		System.out.println(checkIfIdentical(root1,root2));
		System.out.println(checkIdentical(root1,root2));
	}

	private static boolean checkIdentical(Node root1, Node root2) {
		if(root1==null && root2==null) return true;
		if(root1!=null && root2!=null)
		{
			return root1.data==root2.data && checkIdentical(root1.left, root2.left) && checkIdentical(root1.right, root2.right);
		}
		else
			return false;
	}

	private static boolean checkIfIdentical(Node root1, Node root2) {
		if(root1==null && root2==null )  return true;
		else if(root1==null && root2!=null || root2==null && root1!=null) return false;
		if(root1.data==root2.data) {
		boolean l=checkIfIdentical(root1.left, root2.left);
		boolean r=checkIfIdentical(root1.right, root2.right);
		return l && r;
		}
		else
		{
			return false;
		}
	}

}
