package leetcode.problems;

public class BuildArrayFromPermutationV2 {
	 public int[] buildArray(int[] nums) {
		 for(int i = 0; i < nums.length; i++) {
			 nums[i] = nums[i] + (nums.length * (nums[nums[i]] % nums.length));
		 }
		 
		 for(int i = 0; i < nums.length; i++) {
			 nums[i] = (int) nums[i]/nums.length;
		 }
		 
		 return nums;
	 }
}
