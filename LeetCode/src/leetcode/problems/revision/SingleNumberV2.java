package leetcode.problems.revision;

public class SingleNumberV2 {
	//O(n) time, and constant space
	 public int singleNumber(int[] nums) {
		 int num = 0;
		 for(int i : nums) {
			 num ^= i;
		 }
		 return num;
	 }
}
