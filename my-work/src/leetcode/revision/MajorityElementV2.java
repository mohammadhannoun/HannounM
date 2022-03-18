package leetcode.revision;

public class MajorityElementV2 {
	public int majorityElement(int[] nums) {
		int cntr = 0, possible = 0;
		for(int i : nums) {
			if(cntr == 0) possible = i;
			cntr += (i == possible) ? 1 : -1;
		}
		return possible;
	}
}