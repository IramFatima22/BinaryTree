package Day1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BTEncodingDecoding {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		Queue<Integer> check=new LinkedList<Integer>();
		Queue<Integer> data=new LinkedList<Integer>();
		encode(root,data,check);
		print(data);
		System.out.println();
		print(check);
		Node res=decode(check,data);
		System.out.println();
		traverse(res);
	}
	private static void traverse(Node root) {
		if(root==null)
			return;
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);	
	}
	private static Node decode(Queue<Integer> check, Queue<Integer> data) {
		if(check.isEmpty())
			return null;
		int ch=check.poll();
		if(ch==1){
			int x=data.poll();
			Node node=new Node(x);
			node.left=decode(check, data);
			node.right=decode(check,data);
			return node;
		}
		return null;
		
	}

	private static void print(Queue<Integer> q) {
		Iterator<Integer> it=q.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
	private static void encode(Node root, Queue<Integer> data, Queue<Integer> check) {
		if(root==null){
			check.add(0);
			return;
		}
		check.add(1);
		data.add(root.data);
		encode(root.left,data,check);
		encode(root.right,data,check);		
	}

}
