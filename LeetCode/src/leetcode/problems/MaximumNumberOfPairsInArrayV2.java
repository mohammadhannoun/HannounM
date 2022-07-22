package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfPairsInArrayV2 {
	 public int[] numberOfPairs(int[] nums) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for(int i = 0; i < nums.length; i++) {
			 if(map.containsKey(nums[i])) {
				 map.put(nums[i], map.get(nums[i]) + 1);
				 continue;
			 } 
			 map.put(nums[i], 1);
		 }
		 int[] result = new int[2];
		 for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			 result[0] += entry.getValue() / 2;
			 result[1] += entry.getValue() % 2;
		 }
		 return result;
	 }
}
