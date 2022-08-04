package leetcode.problems;

import java.util.HashSet;

public class SetMismatchV2 {
	public int[] findErrorNums(int[] nums) {
		 HashSet<Integer> duplicate = new HashSet<Integer>();
		 int duplicateNumber = 0;
			 for(int i = 0; i < nums.length; i++) {
				 if(!duplicate.add(nums[i])) {
					 duplicateNumber = nums[i];
					 continue;
				 } 
		 }
		for(int i = nums.length; i >= 1; i--) {
			if(!duplicate.contains(nums[i])) {
				return new int[] {duplicateNumber, i};
			}
		}
		return null;
	}
}
