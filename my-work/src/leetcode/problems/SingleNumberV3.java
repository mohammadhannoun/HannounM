package leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberV3 {
	public static void main(String[] args) {
		int[] arr = {-1,-2,6,-2,-1};
		System.out.println(singleNumber(arr));
	}
	public static int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
			for(int i = 0; i < nums.length; i++) {
				if(set.contains(nums[i])) {
					set.remove(nums[i]);
				}
				else {
					set.add(nums[i]);
				}
			}
			 int singleNum = set.iterator().next();
			 return singleNum;
	}
}
