package Day1;

public class AddLeftSubTreeSum {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		method1(root);
		traverse(root);
	}

	private static void traverse(Node root) {
		if(root==null)
			return;
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);	
	}

	private static int method1(Node root) {
		if(root==null)
			return 0;
		int l=method1(root.left);
		int r=method1(root.right);
		root.data+=l;
		return root.data+r;
	}

}
