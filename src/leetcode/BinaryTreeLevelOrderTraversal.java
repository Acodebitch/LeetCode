package leetcode;
import java.util.*;
class TreeNode {
    int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}

public class BinaryTreeLevelOrderTraversal {
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> theList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        int i=0;
        TreeNode tn = new TreeNode(-1);
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(tn);
        q.add(root);
        while(!q.isEmpty())
        {	
        		
        	
        	
        }
        return theList;
    }
}
