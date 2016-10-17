package com.medium;

import static com.hard.NodeNext.traverse;

import com.hard.NodeNext;

public class InOrderSuccessor {
	static NodeNext next=null;
	public static void main(String[] args) {
		NodeNext root=new NodeNext(6);
		root.setLeft(new NodeNext(3));
		root.getLeft().setLeft(new NodeNext(1));
		root.getLeft().setRight(new NodeNext(5));
		root.getLeft().getLeft().setLeft(new NodeNext(15));
		root.setRight(new NodeNext(8));
		root.getRight().setLeft(new NodeNext(7));
		root.getRight().setRight(new NodeNext(11));
		root.getRight().getRight().setLeft(new NodeNext(21));
		
		//inOrderSuccessor(root, null);
		inOrderSuccessorSimpler(root);
		
		traverseInorder(root);
	}

	private static void traverseInorder(NodeNext root) {
		while(root.getLeft()!=null)
		{
			root=root.getLeft();
		}
		while(root!=null)
		{
			System.out.print(root.getData()+" ");
			root=root.getNext();
		}
		
	}

	private static void inOrderSuccessorSimpler(NodeNext root) {
		if(root==null) return;
		//NodeNext next=null;
		inOrderSuccessorSimpler(root.getRight());
		root.setNext(next);
		next=root;
		inOrderSuccessorSimpler(root.getLeft());
		
	}

	private static void inOrderSuccessor(NodeNext root,  NodeNext prev) {
		if(root==null) return;
		inOrderSuccessor(root.getLeft(), root);
		System.out.print(root.getData()+" ");
		NodeNext n=null;
		if(root.getRight()!=null)
		{
			n=root.getRight();
			while(n.getLeft()!=null)
			{
				n=n.getLeft();
			}
		}
		root.setNext(root.getRight()!=null ? n : prev);
		
		inOrderSuccessor(root.getRight(), prev);
	}
}
