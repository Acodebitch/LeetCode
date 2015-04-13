package leetcode;

public class RecoverBinarySearchTree {
	private TreeNode misTree1;
	private TreeNode misTree2;
	private TreeNode preNode;
	public void recoverTree(TreeNode root) {
	        misTree1 = null;
	        misTree2 = null;
	        preNode = new TreeNode(Integer.MIN_VALUE);
	        findTree(root);
	        int temp = misTree1.val;
	        misTree1.val = misTree2.val;
	        misTree2.val = temp;
	    }
	public void findTree(TreeNode root)
	{
		if(root == null)
			return;
		findTree(root.left);
		if(misTree1 == null && preNode.val >= root.val)
			misTree1 = preNode;
		if(misTree1!=null&&preNode.val >= root.val)
			misTree2 = root;
		preNode = root;
		findTree(root.right);
	}

}
