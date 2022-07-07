package leetcode.problems;

public class RemoveElement {
	public static void main(String[] args) {
		int[] arr = {3,2,2,3,3,2,2,3};
		int num = removeElement(arr,3);
		System.out.println(num);
	}
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0) return 0;
			
		int size = 0;
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] != val) {
					nums[size] = nums[i];
					size++;
				}else {
					continue;
				}
			}
			return size;
	}	
}
