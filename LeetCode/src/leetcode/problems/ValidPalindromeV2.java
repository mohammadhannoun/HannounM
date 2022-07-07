package leetcode.problems;

public class ValidPalindromeV2 {
	public static void main(String[] args) {
		String s = "race a car";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		if(s.length() <= 1) {
			return true;
		}
		String u = "";
			for(int j = 0; j < s.length(); j++) {
				if(Character.isLetterOrDigit(s.charAt(j))) {
					u += s.charAt(j);
				}
			}
			u = u.toLowerCase();
			if(u.length() <= 1 || u.charAt(0) == ' ') {
				return true;
			}
		int cntr = u.length() - 1;
		boolean f = false;
			for(int i = 0; i < u.length() / 2; i++) {
				if(u.charAt(i) == u.charAt(cntr)) {
					f = true;
					cntr--;
				} else {
					return false;
				}
			}
		return f;
	}
}
