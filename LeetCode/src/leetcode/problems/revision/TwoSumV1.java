package leetcode.problems.revision;

import java.util.HashMap;

public class TwoSumV1 {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
        	map.put(nums[i], i);
        }
        
       for(int j = 0; j < nums.length; j++) {
    	   if( map.containsKey(target - nums[j]) && map.get(target - nums[j]) != j) {
    		   return new int[] {j, map.get(target - nums[j])};
    	   }
       }
       return new int[] {0,0};
    }
}
