
public class MirrorImage {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		mirror(root);
		traverse(root);
	}

	private static void traverse(Node root) {
		if(root==null)
			return;
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);
	}

	private static void mirror(Node root) {
		if(root==null)
			return;
		mirror(root.left);
		mirror(root.right);
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
	}

}
