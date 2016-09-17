package Day1;
class Result{
	int min,max;
	boolean isBal;
}
public class CheckRBTreeHeightBalanced {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		Result res=check(root);
		System.out.println(res.isBal);
	}

	private static Result check(Node root) {
		Result res=new Result();
		if(root==null){
			res.max=0;
			res.min=0;
			res.isBal=true;
			return res;
		}
		Result ls=check(root.left);
		if(ls.isBal==false)
			return ls;
		Result rs=check(root.right);
		if(rs.isBal==false)
			return rs;
		res.max=Math.max(ls.max, rs.max)+1;
		res.min=Math.min(ls.min, rs.min)+1;
		if(res.min*2>=res.max)
			res.isBal=true;
		else	res.isBal=false;
		return res;
	}

}
