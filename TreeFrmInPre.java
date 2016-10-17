package com.hard;

public class TreeFrmInPre {
	static int preindex=0;
	public static void main(String[] args) {
		int in[]={4,2,5,1,3};
		int pre[]={1,2,4,5,3};
		int n=in.length;
		Node root=buildATree(in,pre,0,n-1,0);
		traverse(root);

	}

	private static void traverse(Node root) {
		if(root==null) return;
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);
		
	}

	private static Node buildATree(int[] in, int[] pre, int start, int end,int index) {
		//if(start>end) return null;
		Node node=new Node(pre[preindex++]);
		if(start==end) return node;
		int mid=search(in,node.data,start,end);
		node.left=buildATree(in, pre, start, mid-1, index++);
		node.right=buildATree(in, pre, mid+1, end, index++);
		return node;
	}

	private static int search(int[] in, int data, int start, int end) {
		for(int i=start;i<=end;i++)
		{
			if(in[i]==data)
				return i;
		}
		return 0;
	}

}
