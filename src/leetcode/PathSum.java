package leetcode;

public class PathSum {
	private boolean hasPath;
public boolean hasPathSum(TreeNode root, int sum) {
    hasPath = false;
    if(root == null) return hasPath;
    hasPath(root,sum,root.val);
	return hasPath;
    }
public void hasPath(TreeNode root,int sum,int TempSum)
{
	if(root.left==null&&root.right==null)
	{
		if(TempSum==sum)
			hasPath = true;
	}
	if(root.left!=null)
	{
		hasPath(root.left,sum,TempSum+root.left.val);
	}
	if(root.right!=null)
	{
		hasPath(root.right,sum,TempSum+root.right.val);
	}
}
}
