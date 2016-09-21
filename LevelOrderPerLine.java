import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderPerLine {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		traverse(root);

	}

	private static void traverse(Node root) {
		Queue<Node> child=new LinkedList<Node>();
		Queue<Node> parent=new LinkedList<Node>();
		child.add(root);
		while(true){
			parent.addAll(child);
			child=new LinkedList<Node>();
			while(!parent.isEmpty()){
				Node n=parent.remove();
				System.out.print(n.data+" ");
				if(n.left!=null) child.add(n.left);
				if(n.right!=null) child.add(n.right);
			}
			System.out.println();
			if(child.isEmpty())
				break;
		}
		
	}

}
