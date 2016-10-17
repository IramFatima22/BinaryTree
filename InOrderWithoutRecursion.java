package com.medium;

import java.util.LinkedList;
import java.util.Stack;

public class InOrderWithoutRecursion {

	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(15);
		root.left.left=new Node(2);
		root.left.right=new Node(7);
		root.right.left=new Node(12);
		//inOrderWithoutRecursion(root);
		//inOrderUsingStack(root);
		inOrderWithourRecursion1(root);

	}

	private static void inOrderWithourRecursion1(Node root) {
		if(root==null) return;
		Stack<Node> s=new Stack<Node>();
		while(root!=null)
		{
			s.push(root);
			root=root.left;
		}
		while(!s.isEmpty())
		{
			Node current=s.pop();
			System.out.print(current.data+" ");
			if(current.right!=null) 
			{	current=current.right;
				s.push(current);
				while(current.left!=null)
				{
					s.push(current.left);
					current=current.left;
				}
			}
			
		}
		
	}

	private static void inOrderUsingStack(Node root) {
		if(root==null)
			return;
		Stack<Node> s=new Stack<Node>();
		while(root!=null)
		{
			s.push(root);
			root=root.left;
		}
		while(!s.isEmpty())
		{
			Node current=s.pop();
			System.out.print(current.data+" ");
			if(current.right!=null)
			{
				s.push(current.right);
				current=current.right;
				while(current.left!=null)
				{
					s.push(current.left);
					current=current.left;
				}
			}
		}
		
	}

	private static void inOrderWithoutRecursion(Node root) {
		if(root==null)
			return;
		LinkedList<Node> list=new LinkedList<Node>();
		while(root!=null)
		{
			list.add(root);
			root=root.left;
		}
		while(!list.isEmpty())
		{
			Node current=list.removeLast();
			System.out.print(current.data+" ");
			if(current.right!=null)
			{	list.add(current.right);
				current=current.right;
				while(current.left!=null)
				{
					list.add(current.left);
					current=current.left;
				}	
			}
			
		}
	}

}
