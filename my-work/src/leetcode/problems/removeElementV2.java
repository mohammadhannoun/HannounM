package leetcode.problems;

public class removeElementV2 {
	public static void main(String[] args) {
		int[] arr = {2};
		int num = removeElement(arr,3);
		System.out.println(num);
	}
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0) return 0;
			int leftPointer = 0;
			int rightPointer = nums.length;
			
			while(leftPointer != rightPointer) {
				if(nums[leftPointer] == val) {
					nums[leftPointer] = nums[rightPointer - 1];
					rightPointer--;
				} else {
					leftPointer++;
				}
			}
			return rightPointer;
	}
}
