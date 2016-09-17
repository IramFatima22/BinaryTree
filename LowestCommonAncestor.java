package Day1;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		Node res=LCA(root,5,4);
		System.out.println(res.data);
	}

	private static Node LCA(Node root, int i, int j) {
		if(root==null)
			return null;
		if(root.data==i || root.data==j)
			return root;
		Node ls=LCA(root.left,i,j);
		Node rs=LCA(root.right,i,j);
		if(ls!=null && rs!=null)
			return root;
		return ls!=null?ls:rs;
	}

}
