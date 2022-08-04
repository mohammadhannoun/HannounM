package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayV3 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			int num = Math.abs(nums[i]);
			nums[num - 1] = -nums[num - 1];
		}	
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) {
				list.add(i + 1);
			}
		}
		return list;
	}
}
