package leetcode.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayV2 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			set.add(i);
		}
		
		for(int i = 1; i <= nums.length; i++) {
			if(!set.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}
}
