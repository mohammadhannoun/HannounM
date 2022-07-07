package leetcode.problems;

public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if(left == right) return head;
		ListNode rev = null;
		ListNode curr = head;
			while(left > 1) {
				rev = curr;
				curr = curr.next;
				left--;
			}
		ListNode prev = rev;
		ListNode tail = curr;
			while(right > 0) {
				ListNode next = curr.next;
				curr.next = rev;
				rev = curr;
				curr = next;
				right--;
			}
			if(prev == null) head = rev;
			else prev.next = rev;
			tail.next = curr;
			return head;
	}
}
// 1 2 3 4 5 
