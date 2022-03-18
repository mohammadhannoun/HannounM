package leetcode.revision;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementV1 {
	public int majorityElement(int[] nums) {
	       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(map.containsKey(nums[i])){
	                map.put(nums[i], map.get(nums[i]) + 1);
	            } else {
	                map.put(nums[i], 1);
	            }
	        }
	        int maj = Integer.MIN_VALUE;
	        int result = 0;
	        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
	            if(entry.getValue() > maj) {
	            	maj = entry.getValue();
	            	result = entry.getKey();
	            }
	        }
	        return result;
	    }
}
