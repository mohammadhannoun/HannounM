package leetcode.problems;

public class MissingNumberV2 {
	//Gauss's law
	public int missingNumber(int[] nums) {
		int sum = ((nums.length) * ((nums.length + 1))) / 2 , som = 0;
			for(int i : nums) {
				som += i;
			}
			return sum - som;
	}
}
