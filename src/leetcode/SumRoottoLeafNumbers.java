package leetcode;
import java.util.*;
public class SumRoottoLeafNumbers {
	private int sum;
public int sumNumbers(TreeNode root) {
    sum = 0; 
	if(root == null) return sum;
	List<Integer> list = new ArrayList<Integer>();
	list.add(root.val);
	Calculate(root,list);
	return sum;
    }
public void Calculate(TreeNode root, List<Integer> list)
{
	if(root.left == null&&root.right == null)
	{
		int tempSum = 0;
		for(int i=0;i<list.size();i++)
		{
			tempSum += list.get(i)*Math.pow(10, list.size()-1-i);
		}
		sum+=tempSum;
	}
	if(root.left!=null)
	{	list.add(root.left.val);
		Calculate(root.left,list);
		list.remove(list.size()-1);
	}
	if(root.right!=null)
	{
		list.add(root.right.val);
		Calculate(root.right,list);
		list.remove(list.size()-1);
	}
}
}
