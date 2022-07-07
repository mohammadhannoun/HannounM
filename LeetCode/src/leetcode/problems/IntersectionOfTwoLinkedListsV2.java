package leetcode.problems;

import java.util.HashMap;

public class IntersectionOfTwoLinkedListsV2 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		HashMap<ListNode, Integer> map = new HashMap<>();
			while(headA != null) {
				map.put(headA, 0);
				headA = headA.next;
			}
			while(headB != null) {
				if(map.containsKey(headB)) return headB;
				headB = headB.next;
			}
			return null;
	}
}
