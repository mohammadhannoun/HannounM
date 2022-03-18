package leetcode.revision;

public class RemoveLinkedListElements {
	 public ListNode removeElements(ListNode head, int val) {
		 while(head != null) {
			 if(head.val == val) {
				 ListNode rem = head;
				 head = head.next;
				 rem.next = null;
			 } else {
				 break;
			 }
		 }
		 
		if(head == null) return head;
		ListNode tmp = head;
			while(tmp.next != null) {
				if(tmp.next.val == val) {
					tmp.next = tmp.next.next;
				} else {
					tmp = tmp.next;
				}
			}
			return head;
	 }
}
