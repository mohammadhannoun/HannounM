package leetcode.problems;

public class XOROperationInAnArray {
	 public int xorOperation(int n, int start) {
	        int[] nums = new int[n];
	        int x = 0;
	        for(int i = 0; i < n; i++){
	            nums[i] = (i * 2) + start;
	            x ^= nums[i];
	        }
	        return x;
	    }
}
