package com.hard;



public class Node {
	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	int data;
	Node left;
	Node right;
	public Node(int data)
	{
		this.data=data;
		this.left=this.right=null;
	}
	public static void Intraverse(Node root)
	{
		if(root!=null)
		{
			Intraverse(root.left);
			System.out.print(root.data+" ");
			Intraverse(root.right);
		}
	}

}
