package leetcode.problems;

public class RemoveNthNodeFromEndOfListV2 {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode fast = temp;
		ListNode slow = temp;
		for(int i = 0; i < n+1; i++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		return temp.next;
	}
}
