
public class RootToLeafPaths {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		int h=getHeight(root);
		int path[]=new int[h];
		printPath(root,path,0);

	}

	private static void printPath(Node root, int[] path, int level) {
		if(root==null)
			return;
		path[level]=root.data;
		level++;
		if(root.left==null && root.right==null){
			print(path,level);
		}
		printPath(root.left, path, level);
		printPath(root.right, path, level);	
	}

	private static void print(int[] path, int l) {
		for(int i=0;i<l;i++)
			System.out.print(path[i]+" ");
		System.out.println();
		
	}

	private static int getHeight(Node root) {
		if(root==null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}

}
