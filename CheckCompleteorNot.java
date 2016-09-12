package Day1;

public class CheckCompleteorNot {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.right.left=new Node(5);
		int s=getSize(root);
		boolean ch=check(root,0,s);
		System.out.println(ch);
	}

	private static boolean check(Node root, int i, int size) {
		if(root==null)
			return true;
		if(i>=size)
			return false;
		else
			return check(root.left, i*2+1, size)&& check(root.right, i*2+2, size);
	}

	private static int getSize(Node root) {
		if(root==null)
			return 0;
		return 1+getSize(root.left)+getSize(root.right);
	}

}
