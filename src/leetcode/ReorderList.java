package leetcode;

public class ReorderList {
public void reorderList(ListNode head) 
	{
		if(head == null||head.next == null)
			return;
		ListNode reverse = new ListNode(head.val);
		ListNode cur = head.next;
		int length = 1;
		while(cur!=null)
		{
			length++;
			ListNode newNode = new ListNode(cur.val);
			newNode.next = reverse;
			reverse = newNode;
			cur = cur.next;
		}
		ListNode cur1 = head;
		ListNode cur2 = reverse;
		ListNode temp = null;
		int size = 1;
		while(size<length)
		{
			if(size%2==1)
			{
				temp = cur1.next;
				cur1.next = cur2;
				cur2 = cur2.next;
			}
			else
			{
				cur1.next = temp;
			}
			cur1 = cur1.next;
			size++;
		}
		cur1.next=null;
		cur2.next= null;
		}
public static void main(String[] args)
{
	ListNode newNode1 = new ListNode(1);
	ListNode newNode2 = new ListNode(2);
	ListNode newNode3 = new ListNode(3);
	//ListNode newNode4 = new ListNode(4);
	newNode1.next= newNode2;
	newNode2.next = newNode3;
	//newNode3.next = newNode4;
	ReorderList rl = new ReorderList();
	rl.reorderList(newNode1);
	System.out.println(newNode1.val);
	System.out.println(newNode1.next.val);
	System.out.println(newNode1.next.next.val);
	//System.out.println(newNode1.next.next.next.val);
	//System.out.println(newNode1.next.next.next.next.val);
	//System.out.println(newNode1.next.next.next.next.val);
	
}
}
