package com.hard;



public class SpecialBinaryTree {

	public static void main(String[] args) {
		int arr[]={1,5,10,40,30,15,28,20};
		Node root=constructTree(arr,0,arr.length-1);
		Node.Intraverse(root);
	}

	private static Node constructTree(int[] arr, int start, int end) {
		if(start>end) return null;
		int maxIndex=findMax(arr,start,end);
		Node data=new Node(arr[maxIndex]);
		if(start==end) return data;
		data.left=constructTree(arr, start, maxIndex-1);
		data.right=constructTree(arr, maxIndex+1,end);
		return data;
	}

	private static int findMax(int[] arr, int start, int end) {
		int max=Integer.MIN_VALUE;
		int index=-1;
		for(int i=start;i<=end;i++)
		{
			if(arr[i]>max)
			{
				index=i;
				max=arr[i];
			}
		}
		return index;
	}

}
