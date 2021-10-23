package leetcode.problems;
import java.util.LinkedList;
public class ValidPalindromeV3 {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	 public static boolean isPalindrome(String s) {
		 if(s.length() <= 1) {
				return true;
			}
		 	s = s.toLowerCase();
		 	boolean f = false;
		LinkedList<Character> list = new LinkedList<>();
			for(int i = 0; i < s.length(); i++) {
				if(isAlphaNumeric(s.charAt(i))) {
					list.add(s.charAt(i));
				}
				else {
					continue;
				}
			}
          if(list.size() <= 1) {
				return true;
			}
          	
			while(!(list.isEmpty())) {
				if(list.peekFirst() == list.peekLast()) {
					f = true;
					list.remove();
					if(!(list.isEmpty())) {
						list.removeLast();	
					}
				} else {
					return false;
				}
			}
			return f;
		    }
	 public static boolean isAlphaNumeric(char c) {
	        if (c >= 'a' && c <= 'z') return true;
	        if (c >= 'A' && c <= 'Z') return true;
	        if (c >= '0' && c <= '9') return true;
	        return false;
	    }
}
