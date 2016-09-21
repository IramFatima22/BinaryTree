
public class CheckIfIdentical {

	public static void main(String[] args) {
		Node root1=new Node(1);
		root1.left=new Node(2);
		root1.right=new Node(3);
		root1.left.left=new Node(4);
		root1.left.right=new Node(5);
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		//root.left.left=new Node(5);
		root.left.right=new Node(5);
		boolean res=check(root,root1);
		System.out.println(res);
	}

	private static boolean check(Node root1, Node root2) {
		if(root1==null && root2==null)
			return true;
		if(root1!=null && root2!=null){
			if((root1.data==root2.data) && check(root1.left, root2.left) 
			&& check(root1.right, root2.right))
				return true;
			else return false;
		}
		return false;
	}

}
