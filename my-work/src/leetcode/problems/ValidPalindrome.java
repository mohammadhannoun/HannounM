package leetcode.problems;
import java.util.Stack;
public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "0p";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		 Stack<Character> stack = new Stack<>();
			boolean f = true;
		    s = s.toLowerCase();	
					for(int i = 0; i < s.length(); i++) {
						if(Character.isLetterOrDigit(s.charAt(i))) {
							stack.push(s.charAt(i));
						}
					}
					while(stack.size() > 1) {
						if(stack.peek() == stack.elementAt(0)) {
							stack.pop();
							stack.remove(0);	
		                    f = true;
						}
						else {
							return false;
						}
					}
					return f;
	}
}
