package com.medium;

public class PrintAncestors {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.left.right.left=new Node(100);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		int h=getHeight(root);
		//System.out.println(h);
		int ans[]=new int[h];
		int k=7;
		int res=getAnscestor(root,k,ans,0);
		if(res!=-1)
		{
			for(int i=0;i<res;i++)
				System.out.print(ans[i]+" ");
		}
		System.out.println();
		printAncestors1(root,k);
	}

	private static boolean printAncestors1(Node root, int k) {
		if(root==null) return false;
		if(root.data==k) return true;
		if(printAncestors1(root.left, k)|| printAncestors1(root.right, k))
		{
			System.out.print(root.data+" ");
			return true;
		}
		return false;
		
	}

	private static int getAnscestor(Node root, int k, int[] ans,int level) {
		if(root==null) return -1;
		if(root.data==k) return level;
		ans[level++]=root.data;
		int res=getAnscestor(root.left, k, ans, level);
		if(res!=-1) return res;
		else return getAnscestor(root.right, k, ans, level);
	}

	private static int getHeight(Node root) {
		if(root==null) return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}

}
