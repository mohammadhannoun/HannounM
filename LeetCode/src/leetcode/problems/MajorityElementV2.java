package leetcode.problems;

public class MajorityElementV2 {
	public int majorityElement(int[] nums) {
		int cntr = 0 , possible = 0;
		for(int num : nums) {
			if(cntr == 0) {
				possible = num;
			}
			cntr += (num == possible) ? 1 : -1;
		}
		return possible;
	}
}
