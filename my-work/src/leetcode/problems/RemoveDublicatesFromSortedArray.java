package leetcode.problems;

public class RemoveDublicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
			int n = nums.length;
			int cntr = 1;
			for(int i = 1; i < n; i++) {
				if(nums[i] != nums[i-1]) {
					cntr++;
				}
			}
			return cntr;
	}
}

