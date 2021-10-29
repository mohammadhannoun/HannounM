package leetcode.problems;

import java.util.HashMap;

public class SingleNumber {
	public static void main(String[] args) {
		int[] arr = {-1,-2,6,-2,-1};
		System.out.println(singleNumber(arr));
	}
	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
			for(int i = 0; i < nums.length; i++) {
				if(map.containsKey(nums[i])) {
					map.put(nums[i], (map.get(nums[i])+1));
				} else {
					map.put(nums[i], 1);
				}
			}
			int number = 0;
			for(int j = 0; j < nums.length; j++) {
				if(map.get(nums[j]) == 1) {
					number = nums[j];
				}
				else {
					continue;
				}
			}
			return number;
	} 
}
