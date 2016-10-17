package com.medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class VerticalLinesSum {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		verticalLinesSum(root,map,0);
		Iterator itr=map.entrySet().iterator();
		while (itr.hasNext()){
			Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		

	}

	private static void verticalLinesSum(Node root,HashMap<Integer, Integer> map,int pos) {
		if(root==null) return;
		if(map.containsKey(pos)){
			map.put(pos,map.get(pos)+root.data);
		}else{
			map.put(pos, root.data);	
		}
		verticalLinesSum(root.left, map, pos-1);
		verticalLinesSum(root.right, map, pos+1);
		
	}

}
