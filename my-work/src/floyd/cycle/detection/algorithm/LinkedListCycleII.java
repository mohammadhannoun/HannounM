package floyd.cycle.detection.algorithm;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		 if(head == null) return null;
			ListNode slow = head;
			ListNode fast = head;
			do {
				if(fast == null || fast.next == null) return null;
				slow = slow.next;
           fast = fast.next.next;
			} while(slow != fast);
			while(head != slow){
           head = head.next;
           slow = slow.next;
       }
   return head;
	}
}
