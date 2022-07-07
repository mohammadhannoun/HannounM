package leetcode.problems;
import java.util.Stack;
public class ValidPalindromeV4 {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				stack.push(s.charAt(i));
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				if(s.charAt(i) == stack.peek()) stack.pop();
				else return false;
			}
		}
		return true;
	}
}
