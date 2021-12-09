package floyd.cycle.detection.algorithm;

public class FindTheDuplicateNumber {
	public int findDuplicate(int[] nums) {
		int slow = nums[0], fast = nums[0];
		while(true) {
			slow = nums[slow];
			fast = nums[nums[fast]];
			if(slow == fast) break;
		}
		int head = nums[0];
		while(head != slow) {
			slow = nums[slow];
			head = nums[head];
		}
		return head;
    }
}
