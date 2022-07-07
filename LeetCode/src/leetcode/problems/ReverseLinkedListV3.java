package leetcode.problems;

public class ReverseLinkedListV3 {
	 public ListNode reverseList(ListNode head) {
		 return reverse(head, null);
	 }
	 public ListNode reverse(ListNode head, ListNode rev) {
		 if(head == null) return rev;
		 ListNode next = head.next;
		 head.next = rev;
		 rev = head;
		 head = next;
		 return reverse(head, rev);
	 }
}
