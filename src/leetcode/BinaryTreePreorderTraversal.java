package leetcode;
import java.util.*;
public class BinaryTreePreorderTraversal {
public List<Integer> preorderTraversal(TreeNode root) {
	Stack<TreeNode> stack = new Stack<TreeNode>();
    List<Integer> res = new ArrayList<Integer>();
    if(root == null) return res;
    stack.push(root);

    while(!stack.isEmpty())
    {
        TreeNode cur_node = stack.pop();
        if(cur_node==null)  break;
        res.add(cur_node.val);
        if(cur_node.right!=null)   stack.push(cur_node.right);
        if(cur_node.left!=null)    stack.push(cur_node.left);
    }
    return res;
    }
}
