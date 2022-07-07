package leetcode.problems;

import java.util.HashMap;

public class DegreeOfAnArrayV2 {
	public static void main(String[] args) {
		int[] nums = {1,3,2,2,3,1};
		System.out.println(findShortestSubArray(nums));
	}
	public static int findShortestSubArray(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> m = new HashMap<>();
		int degree = 0, minLen = 0;
			for(int i = 0; i < nums.length; i++) {
				m.putIfAbsent(nums[i], i);
				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
				if(map.get(nums[i]) > degree) {
					degree = map.get(nums[i]);
					minLen = i - m.get(nums[i]) + 1;
				} else if(map.get(nums[i]) == degree) {
					minLen = Math.min(minLen, i - m.get(nums[i]) + 1);
				}
			}
			return minLen;
	}
}
