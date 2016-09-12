package Day1;

public class MaximumInBT {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		System.out.println(findMax(root));
	}

	private static int findMax(Node root) {
		if(root==null)
			return Integer.MIN_VALUE;
		int l=findMax(root.left);
		int r=findMax(root.right);
		return Math.max(root.data, Math.max(l, r));
	}

}
