package leetcode.problems;

import java.util.HashSet;

public class ContainsDuplicateV2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,3};
		System.out.println(containsDuplicate(arr));
	}
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
			for(int i : nums) {
				if(!set.add(i)) {
					return true;
				}
			}
			return false;
	}
}
