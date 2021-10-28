package leetcode.problems;

public class SingleNumber {
	public static void main(String[] args) {
		int[] arr = {3,3,5,5,1};
		System.out.println(singleNumber(arr));
	}
	public static int singleNumber(int[] nums) {
		if(nums.length == 1) return nums[0];
		int sum = 0;
		int number = 0;
			for(int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
		if(sum % 2 != 0) {
			for(int j = 0; j < nums.length; j++) {
				if((nums[j] % 2 != 0) && ((sum - nums[j]) % 2 == 0)) {
					number = nums[j];
					break;
				}
				else {
					continue;
				}
			}
		}
		return number;
	} 
}
