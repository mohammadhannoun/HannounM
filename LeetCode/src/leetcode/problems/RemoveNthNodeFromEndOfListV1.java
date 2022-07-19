package leetcode.problems;

public class RemoveNthNodeFromEndOfListV1 {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
	  ListNode removed = head;
	  ListNode prevRemoved = head;
	  int cntr = getLength(head);
	  if(cntr == 1 || n == cntr) {
		  return head.next;
	  }
	  while(cntr != n) {
		  removed = removed.next;
		  cntr--;
		  if(cntr != n) {
			  prevRemoved = removed;
		  }
	  }
	  prevRemoved.next = removed.next;
	  removed.next = null;
	  return head;
	} public static int getLength(ListNode head) {
		int length = 0;
		while(head.next != null) {
			head = head.next;
			length++;
		}
		return (length + 1);
	}
}
