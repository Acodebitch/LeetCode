package leetcode;

public class SwapNodesinPairs {
public ListNode swapPairs(ListNode head) 
		{
			if(head==null||head.next==null)
				return head;
			else
			{
				ListNode temp = head.next;
				head.next = head.next.next;
				temp.next = head;
				head = temp;
				ListNode cur = head.next.next;
				ListNode prev = head.next;
				while(cur!=null&&cur.next!=null)
				{
					ListNode itemp = cur.next;
					cur.next = cur.next.next;
					itemp.next = cur;
					prev.next = itemp;
					prev = prev.next.next;
					cur = cur.next.next;
					
					 
				}
			}
			return head;
		}
}

