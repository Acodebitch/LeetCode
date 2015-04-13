package leetcode;
import java.util.*;
public class PathSumII {
private List<List<Integer>> list;
List<Integer> tempList;
public List<List<Integer>> pathSum(TreeNode root, int sum) {
    list = new ArrayList<List<Integer>>();
    tempList = new ArrayList<Integer>();
	if(root == null) return list;
	tempList.add(root.val);
	addSum(root,sum,root.val);
	return list;
    }
public void addSum(TreeNode root,int sum,int tempSum)
{
	if(root.left==null&&root.right==null)
	{
		if(tempSum == sum)
		{
			
			list.add(new ArrayList<Integer>(tempList));
		}
	}
	if(root.left!=null)
	{
		tempList.add(root.left.val);
		addSum(root.left,sum,tempSum+root.left.val);
		tempList.remove(tempList.size()-1);
	}
	if(root.right!=null)
	{
		tempList.add(root.right.val);
		addSum(root.right,sum,tempSum+root.right.val);
		tempList.remove(tempList.size()-1);
	}
	
}
}
