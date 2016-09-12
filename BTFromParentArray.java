package Day1;

public class BTFromParentArray {
	static Node root;
	public static void main(String[] args) {
		int parent[]={1,5,5,2,2,-1,3};
		int n=parent.length;
		Node [] created=new Node[n];
		for(int i=0;i<n;i++)
			built(parent,i,created);
		traverse(root);
	}
	private static void traverse(Node root) {
		if(root==null)
			return;
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);
		
	}
	private static void built(int[] parent, int i, Node[] created) {
		if(created[i]!=null)
			return;
		Node n=new Node(i);
		created[i]=n;
		if(parent[i]==-1){
			root=created[i];
			return;
		}
		if(created[parent[i]]==null){
			built(parent,parent[i],created);
		}
		Node p=created[parent[i]];
		if(p.left==null)
			p.left=n;
		else
			p.right=n;
		
		
		
	}

}
