package leetcode.problems;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
	    ListNode slow = head;
	    ListNode prev = null;
	    	while(slow != null){
	    		ListNode next = slow.next;
	    		slow.next = prev;
	    		prev = slow;
	    		slow = next;
	         }
	    	return prev;
   }
}

