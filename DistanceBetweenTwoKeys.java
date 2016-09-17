package Day1;


public class DistanceBetweenTwoKeys {
	static int d1,d2,res;
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		dist(root,0,5,4);
		System.out.println(res);
	}

	private static Node dist(Node root, int level, int i, int j) {
		if(root==null)
			return null;
		if(root.data==i){
			d1=level;
			return root;
		}
		if(root.data==j){
			d2=level;
			return root;
		}
		Node ls=dist(root.left, level+1, i, j);
		Node rs=dist(root.right,level+1,i,j);
		if(ls!=null && rs!=null){
			res=d1+d2-(2*level);
			return root;
		}
		return ls!=null?ls:rs;
		
	}

}
