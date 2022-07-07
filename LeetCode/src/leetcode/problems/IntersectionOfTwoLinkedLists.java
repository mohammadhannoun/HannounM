package leetcode.problems;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
		int diff = Math.abs((size(headA)) - (size(headB)));
			if(size(headA) > size(headB)) {
				headA = pass(headA, diff);
			} else {
				headB = pass(headB, diff);
			}
			
			while(headA != null && headB != null) {
				if(headA == headB) return headA;
				headA = headA.next;
				headB = headB.next;
			}
			return null;
	}
	
	public int size(ListNode node) {
		int size = 0;
			while(node != null) {
				size++;
				node = node.next;
			}
			return size;
	}
	public ListNode pass(ListNode node, int diff) {
		for(int i = 0; i < diff; i++) {
			node = node.next;
		}
		return node;
	}
}

