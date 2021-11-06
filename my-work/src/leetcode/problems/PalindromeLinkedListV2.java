package leetcode.problems;

public class PalindromeLinkedListV2 { 
	public static void main(String[] args) {
		ListNode head = new ListNode();
		ListNode sec = new ListNode();
		ListNode third = new ListNode();
		ListNode fou = new ListNode();
		head.val = 1;
		sec.val = 2;
		third.val = 2;
		fou.val = 1;
		
		head.next = sec;
		sec.next = null;
		
		System.out.println(isPalindrome(head));
	}
	public static boolean isPalindrome(ListNode head) {
		ListNode last = head;
		for(int i = 0; i < size(head); i++) {
			last = head.next;
		}
		if(size(head) == size(last)+1) {
			return true;
		}
		if(head.val == last.val) {
			return isPalindrome(head.next);
		}
		return false;
	 }
	 public static int size (ListNode node) {
		 int size = 0;
		 while(node != null) {
			 size++;
			 node = node.next;
		 }
		 return size;
	 }
}
