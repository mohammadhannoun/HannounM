package leetcode.revision;

public class PalindromeNumberV2 {
	public boolean isPalindrome(int x) {
		String s1 = "";
		long tmp = x;
		while(tmp != 0) {
			s1 += tmp % 10;
			tmp /= 10;
		}
		tmp = Long.parseLong(s1);
		return(x == tmp);
	}
}
