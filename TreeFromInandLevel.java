package Day1;

public class TreeFromInandLevel {

	public static void main(String[] args) {
		int in[]={4, 8, 10, 12, 14, 20, 22};
		int level[]={20, 8, 22, 4, 12, 10, 14};
		Node n=tree(in,level,0,in.length-1);
		traverse(n);
	}

	private static void traverse(Node n) {
		if(n==null)
			return;
		traverse(n.left);
		System.out.print(n.data+" ");
		traverse(n.right);
		
	}

	private static Node tree(int[] in, int[] level, int start, int end) {
		if(start>end)
			return null;
		if(start==end)
			return new Node(in[start]);
		Node n=null;
		int index=0;
		boolean found=false;
		for(int i=0;i<level.length;i++){
			int val=level[i];
			for(int j=start;j<=end;j++){
				if(in[j]==val){
					n=new Node(in[j]);
					index=j;
					found=true;
					break;
				}
			}
			if(found)
				break;
		}
		n.left=tree(in, level, start, index-1);
		n.right=tree(in,level,index+1,end);
		return n;
	}

}
