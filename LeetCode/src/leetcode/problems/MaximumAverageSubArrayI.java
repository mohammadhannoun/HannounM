package leetcode.problems;

public class MaximumAverageSubArrayI {
	// {1,2,3,4,5,6}
	//  1 2 3 4
	// ....
	// 3 4 5 6  (6 - 4) == 2
	//Window Sliding Algorithm
	//  1 2 3 4 --> 10 
	// 2 3 4 5 --> 14
	// 3 4 5 6 -- > 18 
	public static void main(String[] args) {
		int[] arr = {1,12,-5,-6,50,3};
		double x = findMaxAverage(arr, 4);
		System.out.println(x);
	}
	 public static double findMaxAverage(int[] nums, int k) {
	        int maxF = 0;
				for(int i = 0; i < k; i++) {
					maxF += nums[i];
				}
			int maxS = maxF;
				for(int j = k; j < nums.length; j++) {
					maxS += nums[j] - nums[j - k];
					maxF = Math.max(maxF, maxS);							
				}
				return (double)maxF / k;
	    }
}
