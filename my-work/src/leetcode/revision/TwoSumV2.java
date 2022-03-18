package leetcode.revision;

import java.util.HashMap;

public class TwoSumV2 {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
				return new int[] { i, map.get(target - nums[i]) };
			}
		}
		return null;
	}
}
