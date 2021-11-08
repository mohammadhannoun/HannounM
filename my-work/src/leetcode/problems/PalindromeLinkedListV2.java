package leetcode.problems;

public class PalindromeLinkedListV2 { 
/*1 2 3  ||  3 2 1 
	
	3    2    1 
	next = 2 1 
	node.next = 3 , null   
	prev =  3 , null
	node =  2 1 
	2 1
	next = 1 
	node.next = 2 , 3   
	prev =   2 3 
	node = 1
	 
	next = null
	node.next = null -- >   1 2 3
	prev =  1 2 3
	node = null
 */
	public boolean isPalindrome(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
			while(fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			fast = head;
			slow = reverse(slow);
			
			while(slow != null) {
				if(slow.val != fast.val) return false;
				slow = slow.next;
				fast = fast.next;
			}
			return true;
	} 
	public ListNode reverse(ListNode node) {
		ListNode prev = null;
			while(node != null) {
				ListNode next = node.next;
				node.next = prev;
				prev = node;
				node = next;
			}
			return prev;
	}
}
