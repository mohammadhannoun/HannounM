package leetcode.problems;

public class SmallestRangeIV1 {
	  public int smallestRangeI(int[] nums, int k) {
	        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	        for(int i = 0; i < nums.length; i++) {
	        	max = Math.max(max, nums[i]);
	        	min = Math.min(min, nums[i]);
	        }
	        if((min + k) >= (max - k)) return 0;
	        return ((max - k) - (min + k));
  }
}
