package leetcode;

public class MaximumDepthofBinaryTree {
	private int maximum;
public int maxDepth(TreeNode root) {
        maximum = 0;
        if(root == null) return 0;
        findMin(root,1);
        return maximum;
        
    }
public void findMin(TreeNode root,int num)
{
	if(root.left == null&&root.right == null)
	{
		maximum= num>maximum?num:maximum;
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
