package leetcode.problems;

public class MissingNumberV3 {
	public int missingNumber(int[] nums) {
		int sum = nums.length;
		int som = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += i;
			som += nums[i];
		}
		return sum - som;
	}
}
//[3,0,1]
// sum = 3 + 0 + 1 + 2 = 6 
// som = 4
// result = sum - som ==> true 
// sum if no element is missing ==>
//[3 , 0 , 1] 3 (The next index if nothing was missing) + 0 + 1 + 2 = 6
// actual sum = 3 + 0 + 1 = 4
