package leetcode.problems.revision;

import java.util.HashSet;

public class ContainsDuplicateV2 {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			if(!set.add(i)) return true;
		}
		return false;
	}
}
