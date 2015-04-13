package leetcode;
import java.util.*;
public class BinarySearchTreeIterator {
	Stack<TreeNode> stack=new Stack<TreeNode>();
	 public BinarySearchTreeIterator(TreeNode root) {
		 while(root!=null){
	            stack.push(root);
	            root=root.left;
	        }
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	    	 if(!stack.isEmpty())
	             return true;
	         else
	              return false;
	    }

	    /** @return the next smallest number */
	    public int next() {
	    	int res=0;
	        if(!stack.isEmpty()){
	            TreeNode cur=stack.pop();
	            res=cur.val;
	            cur=cur.right;
	            while(cur!=null){
	                stack.push(cur);
	                cur=cur.left;
	            }
	        }
	        return res;
	    }
}
