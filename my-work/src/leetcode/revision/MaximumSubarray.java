package leetcode.revision;

public class MaximumSubarray {
	 public int maxSubArray(int[] nums) {
		 int maxSum = nums[0];
		 int currentSum = maxSum;
		 for(int i = 1; i < nums.length; i++) {
			currentSum = (currentSum + nums[i]) > currentSum ? currentSum + nums[i] : nums[i]; 
			maxSum=	currentSum > maxSum ? currentSum : maxSum;
		 }
		 return maxSum;
	 }
}
