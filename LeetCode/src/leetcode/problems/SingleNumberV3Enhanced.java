package leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberV3Enhanced {
	public static void main(String[] args) {
		int[] arr = {-1,-2,6,-2,-1};
		System.out.println(singleNumber(arr));
	}
	public static int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
			for(int i = 0; i < nums.length; i++) {
				boolean isDup = set.remove(nums[i]);
				if(!isDup) {
					set.add(nums[i]);
				}
			}
			 int singleNum = set.iterator().next();
			 return singleNum;
	}
}
