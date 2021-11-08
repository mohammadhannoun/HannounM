package leetcode.problems;
public class TwoSumIIV2 {
	public  int[] twoSum(int[] numbers, int target) {
		int min = 0, max = numbers.length - 1;
			while(min < max) {
				int sum = numbers[min] + numbers[max];
				if (sum == target) return new int[] {min + 1, max + 1};
				else if (sum > target) max--;
				else min++;
			}
			return new int[0];
	}
}
