package leetcode.problems;

public class MergeTwoSortedLists {
	public ListNode margeTwoLists(ListNode l1, ListNode l2) {
		ListNode tmp = new ListNode(0);
		ListNode curnt = tmp;
			while(l1 != null && l2 != null) {
				if(l1.val < l2.val) {
					curnt.next = l1;
					l1 = l1.next;
				} else {
					curnt.next = l2;
					l2 = l2.next;
				}
				curnt = curnt.next;
			}
			if(l1 != null) {
				curnt.next = l1;
				l1 = l1.next;
			} 
			if(l2 != null) {
				curnt.next = l2;
				l2 = l2.next;
			}
			return tmp.next;
	}
}
