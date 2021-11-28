package leetcode.problems;
import java.util.HashMap;
public class LinkedListCycleV3 {
	public boolean hasCycle(ListNode head) {
		HashMap<ListNode, Integer> map = new HashMap<>();
		ListNode curr = head;	
			while(curr != null) {
				if(map.isEmpty() && map.containsKey(curr)) return true;
				map.put(curr, 1);
				curr = curr.next;
			}
			return false;
	}
}
