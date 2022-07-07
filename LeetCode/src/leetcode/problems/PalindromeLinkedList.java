package leetcode.problems;

import java.util.Stack;

public class PalindromeLinkedList {
	 public boolean isPalindrome(ListNode head) {
	     Stack<Integer> stack = new Stack<>();
	     ListNode tmp = head;
	     	while(tmp != null) {
	     		stack.push(tmp.val);
	     		tmp = tmp.next;
	     	}
	     	while(!stack.isEmpty()) {
	     		if(stack.peek() != head.val) {
	     			return false;
	     		}
	     		stack.pop();
	     		head = head.next;
	     	}
	     	return true;
	 }
}
