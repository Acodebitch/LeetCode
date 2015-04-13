package leetcode;
class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	          val = x;
	          next = null;
	      }
}
public class AddTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			if(l1==null||l2==null) return null;
			int first = l1.val+l2.val;
			int num = 0;
			if(first>=10)
			{
				first -= 10;
				num = 1;
			}
			ListNode newNode = new ListNode(first);
			ListNode currentNode  = newNode;
			ListNode cur1 = l1.next;ListNode cur2 = l2.next;
			while(cur1!=null||cur2!=null)
			{
			    if(cur1==null && cur2 == null) break;
			    int number1 = 0,number2 = 0;
			    if(cur1 != null)
			        number1 = cur1.val;
			    if(cur2 != null)
			        number2 = cur2.val;
				int current = number1+number2+num;
				if(current>=10)
				{
					current -= 10;
					num=1;
				}
				else
				{
					num = 0;
				}
				currentNode.next = new ListNode(current);
				currentNode = currentNode.next;
				if(cur1!=null)
				cur1 = cur1.next;
				if(cur2!=null)
				cur2 = cur2.next;
			}
			if(num==1)
			{
			    currentNode.next = new ListNode(1);
			}
			
			return newNode;
		    }
public static void main(String [] args)
{
	AddTwoNumbers atn = new AddTwoNumbers();
	
}
}
