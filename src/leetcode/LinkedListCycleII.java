package leetcode;
import java.util.*;
public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
	    // IMPORTANT: Please reset any member data you declared, as
	    // the same Solution instance will be reused for each test case.
	    HashSet nodes = new HashSet();
	    ListNode current = head;

	    while(current != null){
	        if(nodes.contains(current))
	            return current;
	        nodes.add(current);
	        current = current.next;
	    }

	    return null;
}
}
