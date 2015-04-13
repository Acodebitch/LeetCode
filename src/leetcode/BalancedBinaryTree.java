package leetcode;
public class BalancedBinaryTree {
private boolean IsTrue;
public boolean isBalanced(TreeNode root) {
        IsTrue = true;
        check(root);
        return IsTrue;
    }
public int check(TreeNode root)
{
	if(root==null)
		return 0;
	int i = check(root.left);
	int j = check(root.right);
	if(Math.abs(i-j)>1) IsTrue = false;
	return Math.max(i, j)+1;
}
}
