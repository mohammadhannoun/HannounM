package leetcode.problems.revision;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberV3 {
	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			if(!set.add(i)) set.remove(i);
		}
		int res = set.iterator().next();
		return res;
	}
}
