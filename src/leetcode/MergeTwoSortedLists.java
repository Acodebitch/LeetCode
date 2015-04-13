package leetcode;

public class MergeTwoSortedLists {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     if(l1 == null) return l2;
     if(l2 == null) return l1;
	 ListNode head = null;
     ListNode cur = null;
     ListNode cur1 = l1;
     ListNode cur2 = l2;
     while(true)
     {
    	 	if(cur1!=null&&cur2!=null)
    	 	{
    	 		if(l1.val<l2.val)
    	 		{
    	 			ListNode newNode = new ListNode(cur1.val);
    	 			if(head == null)
    	 			{
    	 				head = newNode;
    	 				cur = head;
    	 			}
    	 			else
    	 			{
    	 				cur.next = newNode;
    	 				cur = newNode;
    	 			}
    	 			cur1 = cur1.next;
    	 		}
    	 		else
    	 		{
    	 			ListNode newNode = new ListNode(cur2.val);
    	 			if(head == null)
    	 			{
    	 				head = newNode;
    	 				cur = head;
    	 			}
    	 			else
    	 			{
    	 				cur.next = newNode;
    	 				cur = newNode;
    	 			}
    	 			cur2 = cur2.next;
    	 		}
    	 	}
    	 	if(cur1 == null)
    	 	{
    	 		cur.next = cur2;break;
    	 	}
    	 	if(cur2 == null)
    	 	{
    	 		cur.next = cur1;break;
    	 	}
     }
     return head;
    }
}
