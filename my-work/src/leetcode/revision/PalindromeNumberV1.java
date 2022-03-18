package leetcode.revision;

public class PalindromeNumberV1 {
	public boolean isPalindrome(int x) {
		if (x == Integer.MAX_VALUE)
			return false;
		if (x >= 0 && x < 10)
			return true;
		if (x < 0)
			return false;

		int cntr = -1, tmp = x, rev;

		while (tmp != 0) {
			tmp /= 10;
			cntr++;
		}

		rev = 0;
		tmp = x;

		while (tmp != 0) {
			rev += (tmp % 10) * Math.pow(10, cntr);
			tmp /= 10;
			cntr--;
		}

		return (rev == x);
	}
}
