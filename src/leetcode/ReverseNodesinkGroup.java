package leetcode;

public class ReverseNodesinkGroup {
public ListNode reverseKGroup(ListNode head, int k) 
{
	if(head ==null || head.next == null||k<=1)
		return head;
	ListNode cur = head.next;
	ListNode store = new ListNode(head.val);
	ListNode start = store;
	boolean IsHead = true;
	int length = 1;
	while(true)
	{
		length++;
		if(length%(k+1)==0)
		{
			if(IsHead)
			{
				head = store;
				IsHead = false;
			}
			else
			{
				start.next = store;
			}
			store = new ListNode(cur.val);
		}
		else
		{
			if(cur == null) break;
			ListNode newNode = new ListNode(cur.val);
			newNode.next = store;
			store = newNode;
		}
		cur = cur.next;
	}
	return head;
		
}
	
	public static void main(String [] args)
	{
		ReverseNodesinkGroup rng = new ReverseNodesinkGroup();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		System.out.println(rng.reverseKGroup(l1,2).next.val);
	}
}
