package Day1;

public class RemoveNodeLessThanKLength {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		int k=3;
		remove(root,1,k);
		traverse(root);
	}
	private static void traverse(Node root) {
		if(root==null)
			return;
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);	
	}

	private static Node remove(Node root, int i, int k) {
		if(root==null)
			return null;
		root.left=remove(root.left,i+1,k);
		root.right=remove(root.right,i+1,k);
		if(i<k && root.left==null && root.right==null)
			return null;
		return root;
		
	}

}
