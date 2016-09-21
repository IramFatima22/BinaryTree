
public class InOrderWoStack {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		inorder(root);
	}

	private static void inorder(Node root) {
		Node curr=root;
		while(curr!=null){
			if(curr.left!=null){
				Node n=curr.left;
				while(n.right!=curr && n.right!=null){
					n=n.right;
				}
				if(n.right==null){
					n.right=curr;
					curr=curr.left;
				}
				else{
					System.out.print(curr.data+" ");
					curr=curr.right;
				}
			}
			else{
				System.out.print(curr.data+" ");
				curr=curr.right;
			}
		}
		
	}

}
