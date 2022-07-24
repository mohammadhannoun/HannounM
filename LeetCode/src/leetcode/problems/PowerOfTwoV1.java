package leetcode.problems;

public class PowerOfTwoV1 {
	public boolean isPowerOfTwo(int n) {
        if(n != 1 && n % 2 != 0) return false;
        int i = 0;
        while(Math.pow(2, i) <= n) {
        	if(n == Math.pow(2, i)) {
        		return true;
        	}
        	i++;
        }
        return false;
    }
}
