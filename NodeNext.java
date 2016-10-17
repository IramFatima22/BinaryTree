package com.hard;

public class NodeNext {
	int data;
	NodeNext left;
	NodeNext right;
	NodeNext next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeNext getLeft() {
		return left;
	}

	public void setLeft(NodeNext left) {
		this.left = left;
	}

	public NodeNext getRight() {
		return right;
	}

	public void setRight(NodeNext right) {
		this.right = right;
	}

	public NodeNext getNext() {
		return next;
	}

	public void setNext(NodeNext next) {
		this.next = next;
	}
	public NodeNext(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
		this.next=null;
	}
	
	public static void traverse(NodeNext root) {
		if(root==null) return;
		NodeNext x=root;
		System.out.println();
		NodeNext fc=null;
		while(x!=null)
		{
			if(fc == null){
				fc = x.left!=null ? x.left : x.right;
			}
			System.out.print(x.data+" ");
			x=x.next;
			
		}
		traverse(fc);
		
	}
	@Override
	public String toString() {
		return "NodeNext [data=" + data + "]";
	}
	
	

}
