package leetcode.problems;

public class MaximumSubarray {
	 public int maxSubArray(int[] nums) {
		 int maxSum = nums[0];
		 int currentMax = Integer.MIN_VALUE;
		 	for(int i = 1; i < nums.length; i++) {
		 		currentMax = Math.max(maxSum + nums[i], nums[i]);
		 		maxSum = Math.max(currentMax, maxSum);
		 	}
		 	return maxSum;
	 }
}
//-2 + 1 = -1 -- > -1 > 1 No so new sum --> so curr = 1 max = 1
//1 + -3 = -2 --> -2 > -3 yes  max = 1 
//-2 + 4 = 2 --> 2 > 4 no so new sum = 4 max = 4
//4 + -1 = 3 --> 3 >-1 yes max = 4 
//3 + 2 = 5 --> 5 > 2 yes max = 5 
//5 + 1 = 6 --> 6 > 1 yes max = 6 
//6 -5 = 1 -- > 1 > -5 yes max = 6 
//1 + 4 = 5 --> 5 > 4 yes  max = 6
