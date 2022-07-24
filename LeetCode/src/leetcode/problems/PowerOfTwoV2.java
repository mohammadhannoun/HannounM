package leetcode.problems;

public class PowerOfTwoV2 {
	 public boolean isPowerOfTwo(int n) {
	       return (n > 0) && (n & n-1) == 0;
	}
	 //  4 = 100
	 //  3 = 011
	 // & --> Only if there are two ones, result will be one.
	 //result = 000
}
