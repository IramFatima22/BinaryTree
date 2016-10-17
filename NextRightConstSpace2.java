package com.hard;

public class NextRightConstSpace2 {

	public static void main(String[] args) {
		NodeNext root=new NodeNext(6);
		root.left=new NodeNext(3);
		root.left.left=new NodeNext(1);
		root.left.right=new NodeNext(5);
		root.right=new NodeNext(8);
		root.right.left=new NodeNext(7);
		root.right.left.left=new NodeNext(15);
		root.right.right=new NodeNext(11);
		root.right.right.left=new NodeNext(21);
		root.next=null;
		setNextRight(root);
		NodeNext.traverse(root);

	}	
	private static void setNextRight(NodeNext n) {
		
		while(n!=null)
		{
			NodeNext fc=null;
			NodeNext root=n;
			while(root!=null)
			{
				if(root.left!=null)
				{
					fc=fc==null?root.left:fc;
					NodeNext next=findNextChild(root,true);
					root.left.next=next;
				}
				if(root.right!=null)
				{
					fc=fc==null?root.right:fc;
					NodeNext next=findNextChild(root.next, false);
					root.right.next=next;
				}
				root=root.next;
			}
			n=fc;
		}	
	}
	
	
	private static NodeNext findNextChild(NodeNext root, boolean isLeft) {
		while(root!=null){
			if(isLeft){
				if(root.right!=null) return root.right;
			}else
			{
				if(root.left!=null) return root.left;
				else if(root.right!=null) return root.right;
			}
			root = root.next;
			isLeft = false;
		}
		return null;
	}

}
