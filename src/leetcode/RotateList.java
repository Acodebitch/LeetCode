package leetcode;

public class RotateList {
public ListNode rotateRight(ListNode head, int k) {
	if(head ==null||head.next==null||k==0)
		return head;
ListNode cur = head;
ListNode last = null;
int length = 0;
while(cur!=null)
{
		length++;
		if(cur.next == null)
			last = cur;
		cur = cur.next;
}
int index = 1;
ListNode icur = head;
if(k%length==0)
    return head;
while(index!=length-k%length)
{
		index++;
		icur = icur.next;
}
ListNode start = icur.next;
icur.next = null;
last.next = head;
head = start;
return head;
    }
}
