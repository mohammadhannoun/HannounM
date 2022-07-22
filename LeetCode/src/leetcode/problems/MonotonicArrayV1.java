package leetcode.problems;

public class MonotonicArrayV1 {
	 public boolean isMonotonic(int[] nums) {
		 String decider = "equal";
		 int tmp = 0;
		 for(int i = 0; i < nums.length; i++) {
			 if(i != 0) {
				 if(nums[i] > tmp) {
					 decider = "decreasing";
					 break;
				 } else if(nums[i] < tmp){
					 decider = "increasing";
					 break;
				 }
			 }
			 tmp = nums[i];
		 }
		 if(decider.equals("equal")) {
			 return true;
		 } else if(decider.equals("decreasing")) {
			 tmp = nums[0];
			 for(int i = 1; i < nums.length; i++) {
				 if(nums[i] < tmp) {
					 return false;
				 }
				 tmp = nums[i];
			 }
		 } else {
			 tmp = nums[0];
			 for(int i = 1; i < nums.length; i++) {
				 if(nums[i] > tmp) {
					 return false;
				 }
				 tmp = nums[i];
			 }
		 }
		 return true;
	 }
}
