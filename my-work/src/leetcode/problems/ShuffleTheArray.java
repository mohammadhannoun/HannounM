package leetcode.problems;

import java.util.Arrays;

public class ShuffleTheArray {
	public static void main(String[] args) {
		int[] arr = {2,5,1,3,4,7};
		arr = shuffle(arr, 3);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] shuffle(int[] nums, int n) {
		int p = 1;
		int swp = 0;
		for(int i = 0; i < nums.length ; i++) {
			if(i == n) {
				swp = nums[i];
				nums[i] = nums[p];
				nums[p] = swp;
				n++;
				p++;
			}
		}
		return nums;
	}
}
