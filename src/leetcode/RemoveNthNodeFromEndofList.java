package leetcode;

public class RemoveNthNodeFromEndofList {
public ListNode removeNthFromEnd(ListNode head, int n) {
	if(head == null||n<=0) return head;
	int length = 0;
	ListNode cur = head;
	while(cur!=null)
	{
		length++;
		cur = cur.next;
	}
	cur = head;
	if(n>length) return head;
	if(n==length)
	{
		head = head.next;
		return head;
	}
	int loc = 1;
	while(loc!=length-n)
	{
		loc++;
		cur = cur.next;
	}
	if(cur.next.next!=null) cur.next = cur.next.next;
	else
		cur.next = null;
	return head;
    }
}
