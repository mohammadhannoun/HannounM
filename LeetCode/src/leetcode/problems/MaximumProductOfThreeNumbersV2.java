package leetcode.problems;

public class MaximumProductOfThreeNumbersV2 {
	 public int maximumProduct(int[] nums) {
		 int minF = Integer.MAX_VALUE;
		 int minS = Integer.MAX_VALUE;
		 int maxF = Integer.MIN_VALUE;
		 int maxS = Integer.MIN_VALUE;
		 int maxT = Integer.MIN_VALUE;
		 for(int i : nums) {
			 if(i < minF) {
				 minS = minF;
				 minF = i;
			 } else if(i < minS) {
				 minS = i;
			 }
			 
			 if(i > maxF) {
				 maxT = maxS;
				 maxS = maxF;
				 maxF = i;
			 } else if(i > maxS) {
				 maxT = maxS;
				 maxS = i;
			 } else if(i > maxT) {
				 maxT = i;
			 }
		 }
		 return Math.max(maxF * maxS * maxT, minF * minS * maxF);
	 }
}
