package leetcode.problems;

public class MissingNumberV4 {
	public int missingNumber(int[] nums) {
		 int miss = 0, y = 0;
			for(int i = 0; i <= nums.length; i++) {
				miss ^= i;
	            if(i < nums.length){
	                y ^= nums[i];
	            }
			}
			return miss^y;
	}
}
