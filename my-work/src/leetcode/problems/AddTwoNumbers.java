package leetcode.problems;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode l3 = head;
			while(l1 != null || l2 != null) {
				int fVal = l1 != null ? l1.val : 0;
				int sVal = l2 != null ? l2.val : 0;
				head.next.val = fVal + sVal;
				head = head.next;
				l1 = l1.next;
				l2 = l2.next;
			}
			return l3;
	}
}
