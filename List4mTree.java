package com.hard;

public class List4mTree {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		//Node head=listfromTree(root);
		Node head1=listFromTree1(root);
		printList(head1);
	}

	private static Node listFromTree1(Node root) {
		if(root==null) return null;
		Node l=listFromTree1(root.left);
		Node r=listFromTree1(root.right);
		root.left=root;
		root.right=root;
		l=merge1(l,root);
		l=merge1(l,r);
		return l;
	}

	private static Node merge1(Node l, Node r) {
		if(l==null) return r;
		if(r==null) return l;
		Node preL=l.left;
		Node preR=r.left;
		join1(preL,r);
		join1(preR,l);
		return l;
	}

	private static void join1(Node l, Node r) {
		l.right=r;
		r.left=l;
		
	}

	private static void printList(Node head) {
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.right;
			if(current==head) break;
		}
		
	}

	private static Node listfromTree(Node root) {
		if(root==null) return null;
		Node a=listfromTree(root.left);
		Node b=listfromTree(root.right);
		root.left=root;
		root.right=root;
		a=merge(a,root);
		a=merge(a,b);	
		return a;
	}

	private static Node merge(Node a, Node b) {
		if(a==null) return b;
		if(b==null) return a;
		Node aPrev=a.left;
		Node bPrev=b.left;
		join(aPrev,b);
		join(bPrev,a);
		return a;
		
	}

	private static void join(Node a, Node b) {
		a.right=b;
		b.left=a;
		
	}

}
