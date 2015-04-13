package leetcode;

public class ConvertSortedArraytoBinarySearchTree {
public TreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0) return null;
        TreeNode root = organizedTree(num,0,num.length-1);
        return root;
    }
public TreeNode organizedTree(int []num,int low,int high)
{
	if(low>high)
	{
		return null;
	}
	int mid = (low+high)/2;
	TreeNode root = new TreeNode(num[mid]);
	root.left = organizedTree(num,low,mid-1);
	root.right = organizedTree(num,mid+1,high);
	return root;
}
}
