package leetcode.problems;
import java.util.HashSet;
public class LinkedListCycleV2 {
	public boolean hasCycle(ListNode head) {
		HashSet<ListNode> set = new HashSet<>();
		ListNode cur = head;
			while(cur != null) {
				if(!set.add(cur)) return true;
				set.add(cur);
				cur = cur.next;
			}
			return false;
	}
}
