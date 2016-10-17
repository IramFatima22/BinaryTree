package com.medium;
import java.util.Stack;

public class SpiralLevelOrder {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		//levelOrder(root);
		levelOrder1(root);

	}

	private static void levelOrder1(Node root) {
		if(root==null) return;
		Stack<Node> current=new Stack<Node>();
		current.push(root);
		int check=-1;
		while(true)
		{
			Stack<Node> parent=new Stack<Node>();
			parent.addAll(current);
			current=new Stack<Node>();
			while(!parent.isEmpty())
			{
				Node node=parent.pop();
				System.out.print(node.data+" ");
				if(check>0)
				{
					if(node.left!=null) current.push(node.left);
					if(node.right!=null) current.push(node.right);
				}
				else
				{
					if(node.right!=null) current.push(node.right);
					if(node.left!=null) current.push(node.left);
				}
			}
			check*=-1;
			if(current.isEmpty()) break;
		}
		
	}

	private static void levelOrder(Node root) {
		Stack<Node> current=new Stack<Node>();
		if(root!=null)
			current.push(root);
		int check=0;
		while(true)
		{
			Stack<Node> parent=new Stack<Node>();
			parent.addAll(current);
			current=new Stack<Node>();
			while(!parent.isEmpty())
			{	
				Node node=parent.pop();
				System.out.print(node.data+" ");
				if(check%2==0)
				{
					if(node.right!=null) current.push(node.right);
					if(node.left!=null) current.push(node.left);
				}
				else
				{
					if(node.left!=null) current.push(node.left);
					if(node.right!=null) current.push(node.right);
				}
			}
			if(current.isEmpty()) break;
			System.out.println();
			check++;
		}
			
		
	}

}
