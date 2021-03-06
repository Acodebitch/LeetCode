package leetcode;
import java.util.*;
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null)  return result;
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(curr);
        while (!stack.isEmpty()) {
            curr = stack.pop();
            result.addFirst(curr.val);
            if (curr.left != null )  stack.push(curr.left);
            if (curr.right !=null ) stack.push(curr.right);
        }
        return result;
    }
}
