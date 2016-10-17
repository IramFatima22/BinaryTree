package com.hard;

public class FindDiameter {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.left.right.right=new Node(12);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		int[]res =findDiameter(root);
		System.out.println(res[1]);

	}

	private static int[] findDiameter(Node root) {
		int res[]={0,0};
		if(root!=null)
		{
			int lres[]=findDiameter(root.left);
			int rres[]=findDiameter(root.right);
			int height=1+Math.max(lres[0], rres[0]);
			int ldia=lres[1];
			int rdia=rres[1];
			int dia=rres[0]+lres[0]+1;
			int fianldia=Math.max(dia,Math.max(ldia, rdia));
			res[0]=height;
			res[1]=fianldia;
			return res;
		}
		return res;
	}

}
