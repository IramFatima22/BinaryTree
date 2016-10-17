package com.medium;

public class MaximumWidth {

	public static void main(String[] args) {
		Node root=new Node(6);
		root.left=new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.right=new Node(11);
		int h=findHeight(root);
		int maxwidth=0;
		for(int i=1;i<=h;i++)
		{
			int width=maxWidth(root,i);
			maxwidth=width>maxwidth?width:maxwidth;
		}
		System.out.println(maxwidth);
		/*int hArr[]=new int[h];
		maxWidthMethod2(root,hArr,0);
		int maxW=0;
		for(int i=0;i<hArr.length;i++)
		{
			maxW=hArr[i]>maxW?hArr[i]:maxW;
		}
		System.out.println(maxW);2
		*/
		int hArr[]=new int[h];
		maxWidth2(root,hArr,0);
		System.out.println(findMax(hArr));

	}
	private static int findMax(int[] hArr) {
		int max=0;
		for(int i=0;i<hArr.length;i++)
		{
			System.out.println(hArr[i]);
			max=hArr[i]>max?hArr[i]:max;
		}
		return max;
	}
	private static void maxWidth2(Node root, int[] hArr, int level) {
		if(root==null) return;
		hArr[level]++;
		maxWidth2(root.left,hArr,level+1);
		maxWidth2(root.right, hArr, level+1);
		
		
	}
	private static void maxWidthMethod2(Node root, int[] hArr,int index) {
		if(root==null) return;
		if(root!=null) hArr[index]=hArr[index]+1;
		maxWidthMethod2(root.left, hArr, index+1);
		maxWidthMethod2(root.right, hArr, index+1);
	}



	private static int maxWidth(Node root, int i) {
		if(i==0 || root==null) return 0;
		int count=0;
		if(i==1)
		{
			count++;
		}
		count+=maxWidth(root.left, i-1);
		count+=maxWidth(root.right, i-1);
		return count;
	}

	private static int findHeight(Node root) {
		if(root==null) return 0;
		return Math.max(findHeight(root.left),findHeight(root.right))+1;
		
	}

}
