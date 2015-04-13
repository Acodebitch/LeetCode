package leetcode;

public class RemoveDuplicatesfromSortedListII {
public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null)
    		return head;
    ListNode cur = head.next;
    ListNode prev = head;
    ListNode list = null;
    ListNode theHead = null;
    while(cur!=null)
    {
    		if(prev.val!=cur.val&&(cur.next!=null&&cur.next.val!=cur.val)||cur.next == null&&prev.val!=cur.val)
    			{if(list == null)
    			{
    				ListNode newNode = new ListNode(cur.val);
    				if(prev == head)
    				{
    					list = new ListNode(prev.val);
    					list.next = newNode;
    					list = newNode;
    				}
    				else
    				list = newNode;
    				theHead = list;
    			}
    			else
    			{
    				ListNode newNode = new ListNode(cur.val);
    				list.next = newNode;
    				list = newNode;
    			}
    		}
    		prev = cur;
    		cur = cur.next;
    }
	return theHead;
    }
}
