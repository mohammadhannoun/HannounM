package leetcode.problems;

public class ValidPalindromeV5 {
	 public boolean isPalindrome(String s) {
			s = s.toLowerCase();
			int right = s.length() - 1;
			for(int i = 0; i < right ; i++) {
				if(isAlphaNumeric(s.charAt(i)) && isAlphaNumeric(s.charAt(right))) {
					if(s.charAt(i) == s.charAt(right)) right--; 
	                else return false;
				}
				else if((!isAlphaNumeric(s.charAt(right))) && isAlphaNumeric(s.charAt(i))) {
					i--;
					right--;
				}
				else if((isAlphaNumeric(s.charAt(right))) && !isAlphaNumeric(s.charAt(i))) continue;
	            else right--;
			}
			return true;
	    }
	 public boolean isAlphaNumeric(char c) {
	        if (c >= 'a' && c <= 'z') return true;
	        if (c >= '0' && c <= '9') return true;
	        return false;
	    }
}
