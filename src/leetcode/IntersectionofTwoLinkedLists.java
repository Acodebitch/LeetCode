package leetcode;

public class IntersectionofTwoLinkedLists {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
if(headA==null||headB==null)
 	return null;
 ListNode curA  = headA;
 ListNode curB = headB;
 int lengthA = 0;
 int lengthB = 0;
 while(curA!=null)
 {
 	lengthA++;
 	curA = curA.next;
 }
 while(curB!=null)
 	{
 	lengthB++;
 	curB = curB.next;
 	}
 curA  = headA;
 curB = headB;
 while(lengthA>lengthB)
 {
	 	lengthA--;
 		curA = curA.next;
 		
 }
 while(lengthB>lengthA)
 {
 	curB = curB.next;
 	lengthB--;
 }
 System.out.println(lengthA);
 System.out.println(lengthB);
 System.out.println(curA.val);
 System.out.println(curB.val);
 while(curA!=null&&curB!=null)
 {
 		if(curA == curB)
 			return curA;
 		curA = curA.next;
 		curB = curB.next;
 }
 return null;	
    }
public static void main(String [] args)
{
	IntersectionofTwoLinkedLists ITLL = new IntersectionofTwoLinkedLists();
	ListNode node1 = new ListNode(1);
	ListNode node2 = new ListNode(2);
	ListNode node3 = new ListNode(3);
	ListNode node4 = new ListNode(4);
	node1.next =node2;
	node2.next = node3;
	node3.next = node4;
	System.out.println(ITLL.getIntersectionNode(node1, node3));
}
}
