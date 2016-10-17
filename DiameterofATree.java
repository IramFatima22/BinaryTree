package com.hard;

class Height
{
    int h;
}
public class DiameterofATree {
	Node root;
	int diameterOpt(Node root, Height height)
    {
        Height lh = new Height(), rh = new Height();
        if (root == null)
        {
            height.h = 0;
            return 0; /* diameter is also 0 */
        }
        //lh.h++;     rh.h++; 
        //System.out.println(lh.h+" "+rh.h);
        int ldiameter = diameterOpt(root.left, lh);
        int rdiameter = diameterOpt(root.right, rh);
        height.h = Math.max(lh.h, rh.h) + 1;
        return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
    }
 
    public static void main(String args[])
    {
        DiameterofATree tree = new DiameterofATree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.left.left = new Node(7);
        Height height = new Height();
        System.out.println("The diameter of given binary tree is : "
                           + tree.diameterOpt(tree.root,height));
    }

}
