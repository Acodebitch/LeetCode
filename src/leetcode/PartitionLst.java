package leetcode;

public class PartitionLst {
	 public ListNode partition(ListNode head, int x) {
		    if(head==null||head.next==null)
		    	return head;
			ListNode leftHead = null;
		     ListNode leftCur = null;
		     ListNode rightHead = null;
		     ListNode rightCur = null;
		     ListNode cur = head;
		     while(cur!=null)
		     {
		    	 	ListNode newNode = new ListNode(cur.val);
		    	 	if(cur.val<x)
		    	 	{
		    	 		if(leftHead == null)
		    	 		{
		    	 			leftHead = newNode;
		    	 			leftCur = leftHead;
		    	 		}
		    	 		else
		    	 		{
		    	 			leftCur.next = newNode;
		    	 			leftCur = newNode;
		    	 		}
		    	 	}
		    	 	else
		    	 	{
		    	 		if(rightHead == null)
		    	 		{
		    	 			rightHead = newNode;
		    	 			rightCur = rightHead;
		    	 		}
		    	 		else
		    	 		{
		    	 			rightCur.next = newNode;
		    	 			rightCur = newNode;
		    	 		}
		    	 	}
		    	 	cur = cur.next;
		     }
		     if(leftCur == null)
		    	 	return rightHead;
		     leftCur.next = rightHead;
		     return leftHead;
		    }
}
