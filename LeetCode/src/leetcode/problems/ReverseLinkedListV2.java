package leetcode.problems;
import java.util.Stack;
public class ReverseLinkedListV2 {
	public ListNode reverseList(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
			while(head != null) {
				stack.push(head);
				head = head.next;
			}
			ListNode last = stack.pop();
			ListNode rev = last;
				while(!stack.isEmpty()) {
					last.next = stack.pop();
					last = last.next;
				}
				last.next = null;
				return rev;
	}
}
