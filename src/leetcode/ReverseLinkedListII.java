package leetcode;

public class ReverseLinkedListII {
public ListNode reverseBetween(ListNode head, int m, int n) {
   if(head == null||head.next == null||m==n)
	   return head;
   ListNode cur = head;
   ListNode prev = null;
   int length = 0;
   while(cur!=null)
   {
	   length++;
	   if(length == m-1)
		   prev = cur;
	   if(length == m)
		   break;
	   cur = cur.next;
   }
   ListNode start = new ListNode(cur.val);
   ListNode end = start;
   cur = cur.next;
   while(cur!=null)
   {
	   length++;
	   ListNode newNode = new ListNode(cur.val);
	   newNode.next = start;
	   start = newNode;
	   if(length==n)
		   break;
	   cur = cur.next;
   }
   if(prev!=null)
   prev.next = start;
   else
	   head = start;
   if(cur!=null)
   end.next = cur.next;
   else
	   end.next = null;
   return head;
    }
public static void main(String [] args)
{
	ReverseLinkedListII a = new ReverseLinkedListII();
	ListNode l1 = new ListNode(1);
	ListNode l2 = new ListNode(2);
	ListNode l3 = new ListNode(3);
	ListNode l4 = new ListNode(4);
	ListNode l5 = new ListNode(5);
	l1.next = l2;
	l2.next = l3;
	l3.next = l5;
	l4.next = l5;
	System.out.println(a.reverseBetween(l1,1,5).next.val);
}
}
