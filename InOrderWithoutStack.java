package com.hard;

public class InOrderWithoutStack {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		//inOrderWithoutStack(root);
		//inOrderWithoutStack1(root);
		inOrderWithoutStackWithoutRecursion(root);

	}

	private static void inOrderWithoutStackWithoutRecursion(Node root) {
		if(root==null)
			return;
		Node current=root;
		while(current!=null)
		{
			if(current.left!=null)
			{
				Node preCurrent=current.left;
				while(preCurrent.right!=null && preCurrent.right!=current)
				{
					preCurrent=preCurrent.right;
				}
				if(preCurrent.right==null)
				{
					preCurrent.right=current;
					current=current.left;
				}
				else
				{
					preCurrent.right=null;
					System.out.print(current.data+" ");
					current=current.right;
				}
				
			}
			else
			{
				System.out.print(current.data+" ");
				current=current.right;
			}
			
		}
		
	}

	private static void inOrderWithoutStack1(Node root) {
		if(root==null)
			return;
		Node current=root;
		while(current!=null)
		{
			if(current.left==null)
			{
				System.out.print(current.data+" ");
				current=current.right;
			}
			else
			{
				Node currentLeft=current.left;
				while(currentLeft.right!=null && currentLeft.right!=current)
				{
					currentLeft=currentLeft.right;
				}
				if(currentLeft.right==null)
				{
					currentLeft.right=current;
					current=current.left;
				}
				else
				{
					currentLeft.right=null;
					System.out.print(current.data+" ");
					current=current.right;
				}
					
			}
		}
		
	}

	private static void inOrderWithoutStack(Node root) {
		Node current=root;
		while(current!=null)
		{
			if(current.left==null)
			{
				System.out.print(current.data+" ");
				current=current.right;
			}
			else
			{
				Node currentLeft=current.left;
				while(currentLeft.right!=null && currentLeft.right!=current)
				{
					currentLeft=currentLeft.right;
				}
				if(currentLeft.right==null)
				{
					currentLeft.right=current;
					current=current.left;
				}
				else
				{
					currentLeft.right=null;
					System.out.print(current.data+" ");
					current=current.right;
				}
			}
			
		}
		
	}

}
