package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] arr = {1,2,3,3};
		System.out.println(containsDuplicate(arr));
	}
	public static boolean containsDuplicate(int[] nums) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for(int i = 0; i < nums.length; i++) {
			 if(map.containsKey(nums[i])) {
				 map.put(nums[i], map.get(nums[i])+1);
			 } else {
				 map.put(nums[i], 1);
			 }
		 } 
		 for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			 if(entry.getValue() > 1) {
				 return true;
			 }
		 }
		 return false;
    }
}
