package leetcode;
import java.util.*;
class TreeLinkNode 
{
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x) 
	{ 
		val = x; 
	 }
}
public class PopulatingNextRightPointersinEachNode {
public void connect(TreeLinkNode root) 
{
	Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
	if(root == null) return;
	queue.offer(root);
	while(!queue.isEmpty())
	{
		int length = queue.size();
		for(int i=0;i<length;i++)
		{
			TreeLinkNode newNode = queue.poll();
			if(i!=length-1)
				newNode.next = queue.peek();
			if(newNode.left!=null)
				queue.offer(newNode.left);
			if(newNode.right!=null)
				queue.offer(newNode.right);
		}
	}
}
}
