package Day1;

public class NodeKDistanceFromRoot {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		int height=getHeight(root);
		int arr[]=new int[height];
		boolean visited[]=new boolean[height];
		nodesKDist(root,arr,visited,0,1);
	}

	private static void nodesKDist(Node root, int[] arr, boolean[] visited, int i, int k) {
		if(root==null)
			return;
		arr[i]=root.data;
		i++;
		if(root.left==null && root.right==null && i-k-1>=0 &&
				visited[i-k-1]==false){
			System.out.print(arr[i-k-1]+" ");
			visited[i-k-1]=true;
		}
		nodesKDist(root.left, arr, visited, i, k);
		nodesKDist(root.right, arr, visited, i, k);	
	}

	private static int getHeight(Node root) {
		if(root==null)
			return 0;
		return Math.max(getHeight(root.left),getHeight(root.right))+1;
	}

}
