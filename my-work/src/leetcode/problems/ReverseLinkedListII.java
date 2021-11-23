package leetcode.problems;

public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int left, int right) {
	    ListNode tmp = head;
	    int cntr = 0;
	    ListNode previous = null;
	    	while(cntr != (left - 1 )) {
	    		tmp = tmp.next;
	    		cntr++;
	    	}
	    	cntr = left;
	    while(cntr != right - 1) {
	    	ListNode next = tmp.next;
	    	tmp.next = null;
	    	previous = tmp;
	    	tmp = next;
	    	cntr++;
	    }
	    return previous;
    }
}
 
