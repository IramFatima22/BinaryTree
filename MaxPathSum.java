package Day1;

public class MaxPathSum {
	static int max;
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		maxPath(root);
		System.out.println(max);
	}

	private static int maxPath(Node root) {
		if(root==null)
			return 0;
		int l=maxPath(root.left);
		int r=maxPath(root.right);
		int maxSingle=Math.max(root.data,root.data+ Math.max(l, r));
		int maxTop=Math.max(maxSingle, root.data+l+r);
		max=Math.max(maxTop, max);
		return maxSingle;
	}

}
