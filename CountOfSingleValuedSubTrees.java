package Day1;

public class CountOfSingleValuedSubTrees {
	static int count;
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(1);
		root.left.left=new Node(2);
		root.left.right=new Node(2);
		check(root);
		System.out.println(count);
	}

	private static boolean check(Node root) {
		if(root==null)
			return true;
		boolean l=check(root.left);
		boolean r=check(root.right);
		if(l==false || r==false)
			return false;
		if(root.right!=null && root.data!=root.right.data)
			return false;
		if(root.left!=null && root.data!=root.left.data)
			return false;
		count++;
		return true;
	}

}
