package leetcode;
import java.util.*;
class TreeNode {
    int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}

public class BinaryTreeLevelOrderTraversal {
public List<List<Integer>> levelOrderBottom(TreeNode root) 
{
	List<List<Integer>> list = new ArrayList<List<Integer>>();	Queue<TreeNode> q = new LinkedList<TreeNode>();
	if(root == null) return list;
	q.offer(root);
	while(!q.isEmpty())
	{
		int length = q.size();
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<length;i++)
		{
			TreeNode cur = q.poll();
			l.add(cur.val);
			if(cur.left!=null) q.offer(cur.left);
			if(cur.right!=null) q.offer(cur.right);
		}
		list.add(l);
	}
	return list;
}
}
       

