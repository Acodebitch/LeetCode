package leetcode;
import java.util.*;
public class BinaryTreeInorderTraversal {
public List<Integer> inorderTraversal(TreeNode root) {
	 List<Integer> list = new ArrayList<Integer>();

	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode cur = root;

	    while(cur!=null || !stack.empty()){
	        while(cur!=null){
	            stack.add(cur);
	            cur = cur.left;
	        }
	        cur = stack.pop();
	        list.add(cur.val);
	        cur = cur.right;
	    }

	    return list;
    }
//public void traverse(TreeNode root)
//{
//	if(root!=null)
//    {
//    		inorderTraversal(root.left);
//    		list.add(root.val);
//    		inorderTraversal(root.right);
//    }
//}
}
