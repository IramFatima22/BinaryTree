package Day1;

public class PrintVerticalOrder {
	static int max,min;
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.left.left=new Node(6);
		findMaxMin(root,0);
		printInVerticalOrder(root);
	}
	private static void printInVerticalOrder(Node root) {
		for(int i=min;i<=max;i++){
			print(root,0,i);
			System.out.println();
		}
	}
	private static void print(Node root, int hd,int i) {
		if(root==null)
			return;
		if(hd==i){
			System.out.print(root.data+" ");
			//return;
		}
		print(root.left, hd-1, i);
		print(root.right, hd+1, i);
	}
	private static void findMaxMin(Node root, int hd) {
		if(root==null)
			return;
		if(hd<min)
			min=hd;
		if(hd>max)
			max=hd;
		findMaxMin(root.left, hd-1);
		findMaxMin(root.right, hd+1);
	}

}
