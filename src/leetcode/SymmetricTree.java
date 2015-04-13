package leetcode;
public class SymmetricTree {
	 public boolean isSymmetric(TreeNode root) {
	        if (root == null) {
	            return true;
	        }

	        return helper(root.left, root.right);
	    }

	    private boolean helper(TreeNode a, TreeNode b) {
	        if (a == null && b == null) return true;
	        if (a == null || b == null) return false;  // only one has node in a tree and b tree
	        if (a.val != b.val) return false;
	        return helper(a.left, b.right) && helper(a.right, b.left); // a goes in in-order traversal, b goes right first then left.
	    }
}
