package com.hard;

public class TreeFromInOrderPreOrder {
	static Node root;
	static int preIndex=0;
	public static void main(String[] args) {
		int inorder[]={4,2,5,1,6,3};
		int preorder[]={1,2,4,5,3,6};
		int n=inorder.length;
		Node root=buildATree(inorder,preorder,0,n-1);
		traversal(root);

	}

	private static void traversal(Node root) {
		if(root==null) return;
		traversal(root.left);
		System.out.print(root.data+" ");
		traversal(root.right);
		
	}

	private static Node buildATree(int[] inorder, int[] preorder, int start, int end) {
		if(start>end)
			return null;
		
		Node node=new Node(preorder[preIndex++]);
		System.out.println(node.data+" "+preIndex);
		if(start==end) return node;
		int mid=search(inorder,node.data,start,end);
		node.left=buildATree(inorder, preorder, start, mid-1);
		node.right=buildATree(inorder, preorder, mid+1, end);
		return node;
		
	}

	private static int search(int[] inorder, int data,int start, int end) {
		for(int i=start;i<=end;i++)
		{
			if(inorder[i]==data)
				return i;
		}
		return 0;
	}

	

}
