package leetcode.revision;

public class PalindromeNumberV3 {
	public boolean isPalindrome(int x) {
		if(x < 0) return false;
		if(x >= 0 && x < 10) return true;
		int tmp = x, rev = 0;
		while(tmp != 0) {
			rev += rev*10 + tmp%10;
			tmp /= 10;
		}
		return(x == rev);
	}
}
