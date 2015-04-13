package leetcode;
import java.util.*;
public class BinaryTreeZigzagLevelOrderTraversal {
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		boolean IsLeft = true;
		if(root == null) return list;
		queue.offer(root);
		while(!queue.isEmpty())
		{
			int length = queue.size();
			IsLeft = !IsLeft;
			List<Integer> tempList = new ArrayList<Integer>();
			for(int i=0;i<length;i++)
			{
				TreeNode temp = queue.poll();
				if(IsLeft) tempList.add(temp.val);
				else tempList.add(0, temp.val);
				if(temp.left!=null) queue.offer(temp.left);
				if(temp.right!=null) queue.offer(temp.right);
			}
			list.add(tempList);
		}
		return list;
    }
}
