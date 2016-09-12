package Day1;

public class SumOfLeftLeaves {
	static int sum;
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(7);
		sumLeftLeaves(root);
		System.out.println(sum);
	}
	private static void sumLeftLeaves(Node root) {
		if(root==null)
			return;
		if(isLeaf(root.left))
			sum+=root.left.data;
		else
			sumLeftLeaves(root.left);
		sumLeftLeaves(root.right);
		
	}
	private static boolean isLeaf(Node root) {
		if(root==null)
			return false;
		if(root.left==null && root.right==null)
			return true; 
		return false;
	}

}
