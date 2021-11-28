package leetcode.problems;

public class DetectCycleV2 {
	public ListNode detectCycle(ListNode head) {
		if(head == null) return null;
			ListNode slow = head;
			ListNode fast = head;
			do {
				if(fast == null || fast.next == null) return null;
				slow = slow.next;
				fast = fast.next.next;
			} while(slow != fast);
			return slow;
	}
}
