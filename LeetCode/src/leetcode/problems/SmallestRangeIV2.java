package leetcode.problems;

import java.util.Arrays;

public class SmallestRangeIV2 {
	  public int smallestRangeI(int[] nums, int k) {
		  Arrays.sort(nums);
		  return ((nums[0] + k) >= (nums[nums.length - 1] - k) ? 0 : (nums[nums.length - 1] - k) - (nums[0] + k));
	  }
}
