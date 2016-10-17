package com.hard;

public class Tree4mInPre {

	 static Node root;
	    static int preIndex = 0;
	    Node buildTree(int[] in, int[] pre, int inStrt, int inEnd) {
	 
	        if (inStrt > inEnd) {
	            return null;
	        }
	        Node tNode = new Node(pre[preIndex++]);
	        if (inStrt == inEnd) {
	            return tNode;
	        }
	        int inIndex = search(in, inStrt, inEnd, tNode.data);
	        tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
	        tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
	        return tNode;
	    }
	 
	    int search(int[] in, int strt, int end, int value) {
	        int i;
	        for (i = strt; i <= end; i++) {
	            if (in[i] == value) {
	                return i;
	            }
	 
	        }
	        return i;
	    }
	    void printInorder(Node node) {
	        if (node == null) {
	            return;
	        }
	 
	        printInorder(node.left);
	        System.out.print(node.data + " ");
	        printInorder(node.right);
	    }
	 
	    public static void main(String args[]) {
	        Tree4mInPre tree = new Tree4mInPre();
	        int in[] = new int[]{4, 2, 5, 1, 6, 3};
	        int pre[] = new int[]{1, 2, 4, 5, 3, 6};
	        int len = in.length;
	        Node mynode = tree.buildTree(in, pre, 0, len - 1);
	        System.out.println("Inorder traversal of constructed tree is : ");
	        tree.printInorder(mynode);
	    }
}
