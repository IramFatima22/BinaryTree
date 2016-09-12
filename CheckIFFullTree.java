package Day1;

public class CheckIFFullTree {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		System.out.println(check(root));
	}

	private static boolean check(Node root) {
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		if(root.left!=null && root.right!=null)
			return check(root.left) && check(root.right);
		return false;
		
	}

}
