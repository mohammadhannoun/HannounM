
package leetcode.problems;

public class RemoveLinkedListElements {
	 public ListNode removeElements(ListNode head, int val) {
		 	while(head != null && head.val == val) {
		 		head = head.next;
		 	}
		 ListNode node = head;
		 	while(node != null && node.next != null) {
		 		node.next = node.next.val == val ? node.next.next : node.next;
		 		node = node.next != null && node.next.val != val ? node.next : node;
		 	}
		 	return head;
	    }
}
