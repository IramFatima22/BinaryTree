package Day1;

public class MaxSumBetweenTwoLeaves {
	static int max=0;
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		maxSum(root);
		System.out.println(max);
	}

	private static int maxSum(Node root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return root.data;
		int ls=maxSum(root.left);
		int rs=maxSum(root.right);
		if(root.left!=null && root.right!=null){
			max=Math.max(max, ls+rs+root.data);
			return Math.max(ls, rs)+root.data;
		}
		return root.left!=null?root.left.data+root.data:root.right.data+root.data;
	}

}
