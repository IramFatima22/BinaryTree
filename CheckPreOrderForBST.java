package Day1;

import java.util.Stack;

public class CheckPreOrderForBST {

	public static void main(String[] args) {
		int pre[]={40,30,35,20,80,100};
		System.out.println(check(pre));
	}

	private static boolean check(int[] pre) {
		int root=Integer.MIN_VALUE;
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<pre.length;i++){
			if(root>pre[i])
				return false;
			while(!s.isEmpty() && s.peek()<pre[i]){
				root=s.pop();
			}
			s.push(pre[i]);
		}
		return true;
		
	}

}
