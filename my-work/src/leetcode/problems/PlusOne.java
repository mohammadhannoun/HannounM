package leetcode.problems;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int[] arr = {5,6,2,0,0,4,6,2,4,9};
		System.out.println(Arrays.toString(plusOne(arr)));
	} 
	public static int[] plusOne(int[] digits) {
		for(int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i] += 1;
				return digits;
			}
			digits[i] = 0;
		}
			int[] res = new int[digits.length + 1];
			res[0] = 1;
			return res;
	 }
}

