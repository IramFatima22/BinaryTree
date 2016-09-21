import java.util.Stack;

public class InOrderWoRecursion {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		inorder(root);
	}

	private static void inorder(Node root) {
		Stack<Node> s=new Stack<Node>();
		Node curr=root;
		while(curr!=null){
			s.push(curr);
			curr=curr.left;
		}
		while(!s.isEmpty()){
			Node n=s.pop();
			System.out.print(n.data+" ");
			if(n.right!=null){
				Node curr1=n.right;
				while(curr1!=null){
					s.push(curr1);
					curr1=curr1.left;
				}
			}
		}
	}

}
