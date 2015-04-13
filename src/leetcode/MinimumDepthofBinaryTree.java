package leetcode;

public class MinimumDepthofBinaryTree {
	private int minimal;
public int minDepth(TreeNode root) {
        minimal = 65536;
        if(root == null) return 0;
        findMin(root,1);
        return minimal;
        
    }
public void findMin(TreeNode root,int num)
{
	if(root.left == null&&root.right == null)
	{
		minimal = num<minimal?num:minimal;
		return;
	}
	if(root.left!=null)
	{
		findMin(root.left,num+1);
	}
	if(root.right!=null)
	{
		findMin(root.right,num+1);
	}
}
}
