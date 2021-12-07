package leetcode.problems;

public class FibonacciNumber {
	 public int fib(int n) {
	        if(n <= 1) return n;
			int slow = 0; int fast = 1; int result = (slow + fast);
				for(int i = 2; i < n; i++) {
					slow = fast;
					fast = result;
					result = (slow + fast);
				}
				return result;
	    }
}
