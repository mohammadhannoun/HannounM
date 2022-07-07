package leetcode.problems;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
	  if(head == null) return false;
	  ListNode slow = head;
	  ListNode fast = head.next;
	  	while(slow != fast) {
	  		if(fast == null || fast.next == null) return false;
	  		slow = slow.next;
	  		fast = fast.next.next;
	  	}
	  	return true;
  }
}

/*1 2 3 4 5

5 -- > 2

// slow = 1 / fast = 2
// slow = 2 / fast = 4
// slow = 3 / fast = 2
// slow = 4 / fast = 4
*/