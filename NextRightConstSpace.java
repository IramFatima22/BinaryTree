package com.hard;

public class NextRightConstSpace {

	public static void main(String[] args) {
		NodeNext root=new NodeNext(6);
		root.left=new NodeNext(3);
		root.left.left=new NodeNext(1);
		root.left.right=new NodeNext(5);
		root.left.left.left=new NodeNext(15);
		root.right=new NodeNext(8);
		root.right.left=new NodeNext(7);
		root.right.right=new NodeNext(11);
		root.right.right.left=new NodeNext(21);
		root.next=null;
		setNextRight(root);
		setNextRightWihtoutRecusion(root);
		NodeNext.traverse(root);

	}

	
	private static void setNextRightWihtoutRecusion(NodeNext root) {
		if(root==null) return;
		if(root.left!=null){
			NodeNext next=findNextChild(root,true);
			root.left.next=next;
		}
		if(root.right!=null){
			NodeNext next=findNextChild(root.next, false);
			root.right.next=next;
		}
		setNextRight(root.next);
		setNextRight(root.left);
		setNextRight(root.right);	
		
	}


	private static void setNextRight(NodeNext root) {
		if(root==null) return;
		if(root.left!=null)
		{
			NodeNext next=findNextChild(root,true);
//			System.out.println(root.data+"..."+next.data);
			root.left.next=next;
		}
		if(root.right!=null)
		{
			NodeNext next=findNextChild(root.next, false);
			//System.out.println(next.data);
			root.right.next=next;
		}
		setNextRight(root.next);
		setNextRight(root.left);
		setNextRight(root.right);	
	}
	private static NodeNext findNextChild(NodeNext root, boolean isLeft) {
		if(root==null) return null;
		if(isLeft){
			if(root.right!=null) return root.right;
		}else
		{
			if(root.left!=null) return root.left;
			else if(root.right!=null) return root.right;
		}
		return findNextChild(root.next, false);
		
	}

}
