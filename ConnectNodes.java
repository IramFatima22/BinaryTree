package com.hard;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodes {

	public static void main(String[] args) {
		NodeNext root=new NodeNext(6);
		root.left=new NodeNext(3);
		root.left.left=new NodeNext(1);
		root.left.right=new NodeNext(5);
		root.right=new NodeNext(8);
		root.right.left=new NodeNext(7);
		root.right.right=new NodeNext(11);
		//connectNodes(root,0);
		//traverse(root);
		
		connectNodes1(root);
		traverse(root);
		
	}

	private static void connectNodes1(NodeNext root) {
		if(root==null) return;
		if(root.left!=null)
		{
			NodeNext next=findNext(root,true);
			System.out.println(root.data+"  .."+next.data);
			root.left.next=next;
		}
		if(root.right!=null)
		{
			NodeNext next=findNext(root,false);
			root.right.next=next;
		}
		connectNodes1(root.left);
		connectNodes1(root.right);
	}

	private static NodeNext findNext(NodeNext root, boolean b) {
		if(root==null) return null;
		if(b && root.right!=null){
			return root.right;
		}
		if(!b && root.left!=null)
		{
			return root.left;
		}
		else if(!b && root.right!=null)
		{
			return root.right;
		}
		b=false;
		NodeNext d=findNext(root.next, b);
		return d;
		
		
	}

	private static void traverse(NodeNext root) {
		if(root==null) return;
		NodeNext current=root;
		while(current!=null)
		{	System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
		traverse(root.left);
		
	}

	private static void connectNodes(NodeNext root,int level) {
		if(root==null) return;
		Queue<NodeNext> current=new LinkedList<NodeNext>();
		current.add(root);
		while(true)
		{
			Queue<NodeNext> parent=new LinkedList<NodeNext>();
			parent.addAll(current);
			current=new LinkedList<NodeNext>();
			while(!parent.isEmpty())
			{
				NodeNext node=parent.poll();
				NodeNext next=null;
				if(!parent.isEmpty()) next=parent.peek(); 
				node.next=next;
				if(node.left!=null) current.add(node.left);
				if(node.right!=null) current.add(node.right);	
			}
			if(current.isEmpty()) break;
			
		}
		
		
	}

}
