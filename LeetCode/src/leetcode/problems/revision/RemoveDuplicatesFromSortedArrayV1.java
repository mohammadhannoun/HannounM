package leetcode.problems.revision;

public class RemoveDuplicatesFromSortedArrayV1 {
	public int removeDuplicates(int[] nums) {
		int slow = 1;
		for(int fast = 1; fast < nums.length; fast++) {
			if(nums[fast - 1] != nums[fast]) {
				nums[slow] = nums[fast];
				slow++;
			}
		}
		return slow;
    }
}
