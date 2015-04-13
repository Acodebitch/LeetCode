package leetcode;
import java.util.*;
public class BinaryTreeRightSideView {
public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> list = new ArrayList<Integer>();
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        if(root == null) return list;
	        queue.offer(root);
	        while(!queue.isEmpty())
	        {
	        		int length = queue.size();
	        		for(int i=0;i<length;i++)
	        		{
	        			TreeNode temp = queue.poll();
	        			if(i == length-1)
	        				list.add(temp.val);
	        			if(temp.left!=null)
	        				queue.offer(temp.left);
	        			if(temp.right!=null)
	        				queue.offer(temp.right);
	        		}
	        }
	        return list;
	    }
}
