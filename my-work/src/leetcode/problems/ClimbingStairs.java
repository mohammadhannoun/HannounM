package leetcode.problems;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
	public static int climbStairs(int n) {
		int res = (n / 2) + (n - (n / 2));
		return res;
	}
}
