package com.hard;

import java.util.Collections;
import java.util.HashMap;

public class MaximumRootToLeafPath {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
//		root.left.right.right=new Node(12);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		HashMap<Integer, Node> map=new HashMap<Integer,Node>();
		maxSum(root,root.data,map);
		int maxSumKey = Collections.max(map.keySet());
		Node maxLeaf=map.get(maxSumKey);
		traverseToSearch(root,maxLeaf);
		
			
	

	}

	private static boolean traverseToSearch(Node root, Node maxLeaf) {
		if(root==null){
			return false;
		}
		if(maxLeaf.equals(root)){
			System.out.println(maxLeaf.data);
			return true;
		}
		boolean res = traverseToSearch(root.left, maxLeaf) 
				|| traverseToSearch(root.right, maxLeaf);
		if(res){
			System.out.println(root.data);
			return true;
		}
		return false;
		
	}

	private static void maxSum(Node root, int data, HashMap<Integer, Node> map) {
			if(root==null) return;
			if(root.left==null && root.right==null)
				map.put(data+root.data, root);
			else
			{
				maxSum(root.left, data+root.data, map);
				maxSum(root.right, data+root.data, map);
			}
			
			
		
	}

}
