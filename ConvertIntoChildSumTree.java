package com.hard;

public class ConvertIntoChildSumTree {

	public static void main(String[] args) {
		Node root=new Node(24);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		//root.left.right.right=new Node(12);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(9);
		//convertTree(root);
		traversal(root);
		System.out.println();
		//convertTree1(root);
		//traversal(root);
		convertTree2(root);
		traversal(root);

	}

	private static void convertTree2(Node root) {
		if(root.left==null && root.right==null) return;
		int l=0,r=0;
		if(root.left!=null)
		{	convertTree2(root.left);
			l=root.left.data;
		}
		if(root.right!=null)
		{
			convertTree2(root.right);
			r=root.right.data;
		}
		int diff=root.data-(l+r);
		
		if(root.data<l+r) root.data=l+r;
		else if(root.data>l+r)
		{
			increment2(root,diff);
		}
		
	}

	private static void increment2(Node root, int diff) {
		//System.out.println(diff);
		if(root.left!=null)
		{
			root.left.data+=diff;
			increment2(root.left, diff);
		}
		else if(root.right!=null)
		{
			root.right.data+=diff;
			increment2(root.right, diff);
		}
		
	}

	private static void convertTree1(Node root) {
		if(root==null)  return;
		int l=0,r=0;
		convertTree(root.left);
		convertTree(root.right);
		if(root.left!=null) l=root.left.data;
		if(root.right!=null) r=root.right.data;
		if(root.data<l+r) root.data=l+r;
		else if(root.data>l+r)
		{
			increment1(root,root.data-l+r);
		}
		
	}

	private static void increment1(Node root, int diff) {
		if(root.left!=null)
		{
			root.left.data+=diff;
			increment1(root.left, diff);
		}
		else if(root.right!=null)
		{
			root.right.data+=diff;
			increment1(root.right, diff);
		}
		
	}

	private static void traversal(Node root) {
		if(root==null) return;
		traversal(root.left);
		System.out.print(root.data+" ");
		traversal(root.right);
		
	}

	private static void convertTree(Node root) {
		if(root.left==null && root.right==null)
			return;
		int l=0,r=0;
		convertTree(root.left);
		convertTree(root.right);
		if(root.left!=null)
		{
			l=root.left.data;
			
		}
		if(root.right!=null)
		{
			r=root.right.data;
			
		}
			
		if(l+r>root.data){
			root.data=l+r;
		}
		else
		{
			increment(root,root.data-l+r);
		}
			
		
	}

	private static void increment(Node root, int i) {
		if(root.left!=null)
		{
			root.left.data=root.left.data+i;
			increment(root.left,i);
		}
		else if(root.right!=null)
		{
			root.right.data=root.right.data+i;
			increment(root.right,i);
		}
		
		
	}

}
