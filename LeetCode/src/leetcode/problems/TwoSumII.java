package leetcode.problems;

import java.util.Arrays;

public class TwoSumII {
	public static void main(String[] args) {
		int[] numbers = {2,3,4};
		System.out.println(Arrays.toString(twoSum(numbers, 6)));
	}
	public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int [2];
        int slow = 0, fast = slow + 1;
        	while(slow < (numbers.length - 1)) {
        		if((numbers[slow] + numbers[fast]) == target) {
        			result[0] = slow + 1;
        			result[1] = fast + 1;
        				break;
        		}
        		if(fast == numbers.length - 1) {
        			slow += 1;
        			fast = slow;
        		}
        		fast++;
        	}
        	return result;
    }
}
