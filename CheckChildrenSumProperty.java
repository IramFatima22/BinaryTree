package com.medium;

public class CheckChildrenSumProperty {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(2);
		root.left.left=new Node(2);
		root.left.right=new Node(1);
		root.right=new Node(4);
		root.right.left=new Node(3);
		root.right.right=new Node(1);
		//System.out.println(checkProperty(root));
		System.out.println(checkChildSum(root));

	}

	private static boolean checkChildSum(Node root) {
		if(root.left==null && root.right==null) return true;
		boolean ans=true;
		int l=0,r=0;
		if(root.left!=null)
		{	ans=ans&&checkChildSum(root.left);
			l=root.left.data;
		}
		else
			ans=true;
		if(root.right!=null)
		{	ans=ans&&checkChildSum(root.right);
			r=root.right.data;
		}
		else ans=true;
		if( root.data==l+r) return ans&&true;
		else return false;
		
	}

	private static boolean checkProperty(Node root) {
		if(root.left==null && root.right==null)
			return true;
		boolean ans=true;
		int l=0,r=0;
		if(root.left!=null){ 
			ans=ans && checkProperty(root.left);
			l=root.left.data;
		}
		else ans= true;
		if(root.right!=null){
			ans=ans && checkProperty(root.right);
			r=root.right.data;
		}
		else ans= true;
		if(root.data==l+r) return true&&ans;
		else return false;
		
	}

}
