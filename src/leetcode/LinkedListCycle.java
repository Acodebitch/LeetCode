package leetcode;

public class LinkedListCycle {
	 public boolean hasCycle(ListNode head) {
		   // set two runners
		ListNode slow = head;
		ListNode fast = head;

		// fast runner move 2 steps at one time while slow runner move 1 step,
		// if traverse to a null, there must be no loop
		while (fast != null && fast.next != null) {
		    slow = slow.next;
		    fast = fast.next.next;
		    if (slow == fast) {
		        return true;
		    }
		}
		return false;
		}
	 }
