package leetcode.problems;
import java.util.HashSet;
public class DetectCycle {
	public ListNode detectCycle(ListNode head) {
		if(head == null) return null;
		HashSet<ListNode> set = new HashSet<>();
		ListNode curr = head;
			while(curr != null) {
				if(!set.add(curr)) return curr;
				set.add(curr);
				curr = curr.next;
			}
			return null;
	}
}
