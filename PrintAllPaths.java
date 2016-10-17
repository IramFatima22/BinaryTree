package com.hard;

public class PrintAllPaths {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.left.right.right=new Node(12);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		int path[]=new int[10];
		//printAllPaths(root,path,0);
		//rootToLeafPaths(root,path,0);
		int h=getHeight(root);
		int pathe[]=new int[h];
		printAllPathes(root,pathe,0);

	}

	private static int getHeight(Node root) {
		if(root==null) return 0;
		return 1+Math.max(getHeight(root.left), getHeight(root.right));
	}

	private static void printAllPathes(Node root,int [] path,int i) {
		path[i++]=root.data;
		if(root.left==null && root.right==null)
		{
			for(int j=0;j<i;j++)
				System.out.print(path[j]+" ");
			System.out.println();
			return;
		}
		if(root.left!=null)
			printAllPathes(root.left, path, i);
		if(root.right!=null)
			printAllPathes(root.right, path, i);
		
	}

	private static void rootToLeafPaths(Node root, int[] path, int i) {
		if(root==null) return;	//if either left or right is null
		if(root.left==null && root.right==null)
		{
			path[i++]=root.data;
			for(int j=0;j<i;j++)
				System.out.print(path[j]+" ");
			System.out.println();
			return;
		}
		path[i++]=root.data;
		rootToLeafPaths(root.left, path, i);
		rootToLeafPaths(root.right, path, i);	
	}

	
	
	private static Node printAllPaths(Node root,int[] path,int i) {
		if(root==null) return null;
		path[i++]=root.data;
		Node l=printAllPaths(root.left, path, i);
		Node r=printAllPaths(root.right, path, i);
		if(l==null && r==null)
		{	
			for(int j=0;j<i;j++)
				System.out.print(path[j]+" ");
			System.out.println();
		}
		return root;
		
		
	}

}
