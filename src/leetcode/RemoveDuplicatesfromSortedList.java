package leetcode;

public class RemoveDuplicatesfromSortedList {
public ListNode deleteDuplicates(ListNode head) {
        if(head == null||head.next==null)
        		return head;
		ListNode cur = head;
        ListNode prev = null; 
        while(cur!=null)
        {
        		if(prev!=null)
        		{
        			if(cur.val == prev.val)
        			{
        				prev.next = cur.next;
        			}
        			else
        				prev = cur;
        		}
        		else
        			prev = cur;
        		cur = cur.next;
        }
        return head;
        	
    }
}
