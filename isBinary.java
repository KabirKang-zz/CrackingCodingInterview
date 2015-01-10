/*
4.5 Implement a function to check if a binary tree is a binary search tree.
The problem with using the in-order traversal method, is that it can poorly handle cases where
there are duplicate nodes.
The other methodology is to use the definition of BST that says left<=curr<right:
We must ensure that ALL left nodes are less than or equal to the current node, 
which must be less than ALL right nodes.
*/

public class isBinary{
    public class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	private int size = 0;
    }
    public static void main(String[] args)
    {
    }
}