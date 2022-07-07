package leetcode.problems;
import java.util.HashSet;
public class MissingNumber {
	 public int missingNumber(int[] nums) {
	 HashSet<Integer> set = new HashSet<>();
	 for(int i = 0; i < nums.length; i++) {
		 set.add(nums[i]);
	 }
	 for(int i = 0; i <= nums.length; i++) {
		 if(set.contains(i)) continue;
		 else return i;
	 }
	 return 0;
   }
}
